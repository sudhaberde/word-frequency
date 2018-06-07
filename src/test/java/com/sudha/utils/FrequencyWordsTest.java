package com.sudha.utils;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class FrequencyWordsTest {

    @Test
    public void testPrintWordOfFrequency1() throws Exception {
        Set<String> res = FrequencyWords.printWordOfFrequency("a a a b", 1);
        Assert.assertEquals(1, res.size());
        Assert.assertTrue(res.contains("b"));
    }

    @Test
    public void testPrintWordOfFrequency3() throws Exception {
        Set<String> res = FrequencyWords.printWordOfFrequency("a a a b", 3);
        Assert.assertEquals(1, res.size());
        Assert.assertTrue(res.contains("a"));
    }

    @Test
    public void testPrintWordOfFrequency0() throws Exception {
        Set<String> res = FrequencyWords.printWordOfFrequency("a a a b", 0);
        Assert.assertEquals(0, res.size());
    }

    @Test
    public void testPrintWordOfFrequencyMultiSet() throws Exception {
        Set<String> res = FrequencyWords.printWordOfFrequency("a a a b b c c", 2);
        Assert.assertEquals(2, res.size());
        Assert.assertTrue(res.contains("b"));
        Assert.assertTrue(res.contains("c"));
    }
}