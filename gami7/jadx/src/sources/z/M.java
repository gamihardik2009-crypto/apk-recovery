package z;

import android.view.KeyEvent;
import l0.C0813a;

/* loaded from: classes.dex */
public final class M implements J {
    @Override // z.J
    public final int a(KeyEvent keyEvent) {
        int i2 = 0;
        if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
            long d3 = K1.f.d(keyEvent.getKeyCode());
            if (C0813a.a(d3, Y.f11590i)) {
                i2 = 41;
            } else if (C0813a.a(d3, Y.f11591j)) {
                i2 = 42;
            } else if (C0813a.a(d3, Y.f11592k)) {
                i2 = 33;
            } else if (C0813a.a(d3, Y.f11593l)) {
                i2 = 34;
            }
        } else if (keyEvent.isAltPressed()) {
            long d4 = K1.f.d(keyEvent.getKeyCode());
            if (C0813a.a(d4, Y.f11590i)) {
                i2 = 9;
            } else if (C0813a.a(d4, Y.f11591j)) {
                i2 = 10;
            } else if (C0813a.a(d4, Y.f11592k)) {
                i2 = 15;
            } else if (C0813a.a(d4, Y.f11593l)) {
                i2 = 16;
            }
        }
        return i2 == 0 ? L.f11523a.a(keyEvent) : i2;
    }
}
