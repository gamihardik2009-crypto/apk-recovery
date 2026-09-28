package u;

import android.view.KeyEvent;
import l0.C0813a;
import z.J;
import z.Y;

/* loaded from: classes.dex */
public final class u implements J {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f10784a;

    @Override // z.J
    public int a(KeyEvent keyEvent) {
        int i2 = 0;
        if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
            long d3 = K1.f.d(keyEvent.getKeyCode());
            if (C0813a.a(d3, Y.f11590i)) {
                i2 = 35;
            } else if (C0813a.a(d3, Y.f11591j)) {
                i2 = 36;
            } else if (C0813a.a(d3, Y.f11592k)) {
                i2 = 38;
            } else if (C0813a.a(d3, Y.f11593l)) {
                i2 = 37;
            }
        } else if (keyEvent.isCtrlPressed()) {
            long d4 = K1.f.d(keyEvent.getKeyCode());
            if (C0813a.a(d4, Y.f11590i)) {
                i2 = 4;
            } else if (C0813a.a(d4, Y.f11591j)) {
                i2 = 3;
            } else if (C0813a.a(d4, Y.f11592k)) {
                i2 = 6;
            } else if (C0813a.a(d4, Y.f11593l)) {
                i2 = 5;
            } else if (C0813a.a(d4, Y.f11584c)) {
                i2 = 20;
            } else if (C0813a.a(d4, Y.f11600t)) {
                i2 = 23;
            } else if (C0813a.a(d4, Y.f11599s)) {
                i2 = 22;
            } else if (C0813a.a(d4, Y.f11589h)) {
                i2 = 43;
            }
        } else if (keyEvent.isShiftPressed()) {
            long d5 = K1.f.d(keyEvent.getKeyCode());
            if (C0813a.a(d5, Y.f11596o)) {
                i2 = 41;
            } else if (C0813a.a(d5, Y.f11597p)) {
                i2 = 42;
            }
        } else if (keyEvent.isAltPressed()) {
            long d6 = K1.f.d(keyEvent.getKeyCode());
            if (C0813a.a(d6, Y.f11599s)) {
                i2 = 24;
            } else if (C0813a.a(d6, Y.f11600t)) {
                i2 = 25;
            }
        }
        return i2 == 0 ? ((J) this.f10784a).a(keyEvent) : i2;
    }
}
