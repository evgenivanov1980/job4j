package ru.job4j.streamapi.pupil;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {
    public static double averageScore(Stream<Pupil> pupilStream) {
        return pupilStream.map(Pupil::getSubject)
                .flatMap(Collection::stream)
                .mapToDouble(Subject::getScore).average().orElse(0);
    }
    public static List<Tuple> averageScoreBySubject(Stream<Pupil> pupilStream) {
        return pupilStream.map(Pupil::getName).map(Pupil::getSubject).flatMap(Collection::stream).flatMap()
                .mapToDouble(Subject::getScore).average().collect(Collectors.toList());
}
