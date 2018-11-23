package com.neha;

import com.neha.Display;
import com.neha.Storage;

public class Computer {
    private Storage disk;
    private Display display;

    public Computer(Storage disk, Display display){
        this.disk = disk;
        this.display = display;

        this.disk.write();
        this.display.show();
    }
}
