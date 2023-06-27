package com.example.newsx2;

import com.example.newsx2.Models.NewsHeadlines;

import java.util.List;

public interface OnfetchDataListener<NewApiResponse> {
    void onFetchData(List<NewsHeadlines> list, String messages);

    void onError(String message);
}
