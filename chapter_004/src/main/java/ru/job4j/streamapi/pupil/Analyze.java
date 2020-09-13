package ru.job4j.streamapi.pupil;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {
    public static double averageScore(Stream<Pupil> pupilStream) {
        return pupilStream.map(Pupil::getSubject)
                .flatMap(Collection::stream)
                .mapToDouble(Subject::getScore).average().orElse(0);
    }
    public static List<Tuple> averageScoreBySubject(Stream<Pupil> pupilStream) {
        return pupilStream.map(p -> new Tuple(p.getName(), p.getSubject().stream().mapToDouble(Subject::getScore)
                .average().orElse(0))).collect(Collectors.toList());
    }
    public static List<Tuple> averageScoreByPupil(Stream<Pupil> pupilStream) {
        List<Subject> subjects = pupilStream.map(Pupil::getSubject).flatMap(Collection::stream)
                .collect(Collectors.toList());
        Map<String, Double> score = subjects.stream()
                .collect(Collectors.groupingBy(Subject::getName, Collectors.averagingDouble(Subject::getScore)));
        return score.entrySet().stream().map(s -> new Tuple(s.getKey(), s.getValue())).collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> pupilStream) {
        return pupilStream.map(p -> new Tuple(p.getName(), p.getSubject().stream()
                .max(Comparator.comparing(Subject::getScore)))).collect(Collectors.toList());
    }

}



