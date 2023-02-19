package com.fastcampus.projectboard.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.IntStream;

@Service
public class PaginationService {

    private static final int BAR_LENGTH = 5;

    public List<Integer> getPaginationBarNumbers(int currentPageNumber, int totalPages) {
       int startNumber = Math.max(currentPageNumber - (BAR_LENGTH / 2), 0); //페이지 음수 방지
       int endNumber = Math.min(startNumber + BAR_LENGTH, totalPages); //마지막 페이지보다 큰 수의 페이지가 나오지 않게 처리

        return IntStream.range(startNumber, endNumber).boxed().toList();
    }

    public int currentBarLength() {
        return BAR_LENGTH;
    }
}
