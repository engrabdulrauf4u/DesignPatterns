package com.example.DesignPatterns.structural.adapter.adapterclass;

import com.example.DesignPatterns.structural.adapter.concretes.JpgShower;
import com.example.DesignPatterns.structural.adapter.concretes.PngShower;
import com.example.DesignPatterns.structural.adapter.interfaces.AdvancedImageViewer;
import com.example.DesignPatterns.structural.adapter.interfaces.ImageViewer;

public class ImageAdapter implements ImageViewer {

    AdvancedImageViewer advancedImageViewer;

    public ImageAdapter(String imageFormat) {
        if(imageFormat.equalsIgnoreCase("png") ){
            advancedImageViewer = new PngShower();
        }else if (imageFormat.equalsIgnoreCase("jpg")){
            advancedImageViewer = new JpgShower();
        }
    }

    @Override
    public void show(String imageFormat, String fileName) {
        if(imageFormat.equalsIgnoreCase("png")){
            advancedImageViewer.showPng(fileName);
        }
        else if(imageFormat.equalsIgnoreCase("jpg")){
            advancedImageViewer.showJpg(fileName);
        }
    }
}
