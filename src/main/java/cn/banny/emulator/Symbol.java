package cn.banny.emulator;

import cn.banny.emulator.pointer.UnicornPointer;
import com.sun.jna.Pointer;

public abstract class Symbol {

    public abstract Number[] call(Emulator emulator, Object... args);

    public  abstract long getAddress();

    public abstract boolean isUndef();

    public Pointer createPointer(Emulator emulator) {
        return UnicornPointer.pointer(emulator, getAddress());
    }

}