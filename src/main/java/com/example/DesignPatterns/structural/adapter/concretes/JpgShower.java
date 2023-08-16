package com.example.DesignPatterns.structural.adapter.concretes;

import com.example.DesignPatterns.structural.adapter.interfaces.AdvancedImageViewer;

public class JpgShower implements AdvancedImageViewer {
    @Override
    public void showPng(String fileName) {

    }

    @Override
    public void showJpg(String fileName) {
        System.out.println("Showing jpg file. Name: "+ fileName);

    }
}
