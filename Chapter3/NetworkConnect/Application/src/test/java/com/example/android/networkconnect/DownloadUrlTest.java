package com.example.android.networkconnect;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

import java.io.IOException;


public class DownloadUrlTest {

    DownloadUrl tDownloadUrl;
    String htmlStr;

    @Before
    public void setUp() {
        try {
            htmlStr = tDownloadUrl.loadFromNetwork("http://www.google.com");
        } catch (IOException e) {
            // network error
        }
    }

    @Test
    public void downloadUrlTest_ReturnsTrue() {
            assertThat(htmlStr,containsString("doctype"));
    }
}
