package com.example.DesignPatterns.structural.adapter.concretes;

import com.example.DesignPatterns.structural.adapter.interfaces.AdvancedImageViewer;

public class PngShower implements AdvancedImageViewer {
    @Override
    public void showPng(String fileName) {
        System.out.println("Showing png file. Name: "+ fileName);
    }

    @Override
    public void showJpg(String fileName) {

    }
}
