package Z;

import android.view.KeyEvent;
import l0.C0813a;
import z.J;
import z.Y;

/* loaded from: classes.dex */
public final class f implements J {

    /* renamed from: a, reason: collision with root package name */
    public y2.c f6382a;

    @Override // z.J
    public int a(KeyEvent keyEvent) {
        l0.b bVar = new l0.b(keyEvent);
        y2.c cVar = this.f6382a;
        if (!((Boolean) cVar.l(bVar)).booleanValue() || !keyEvent.isShiftPressed()) {
            if (((Boolean) cVar.l(new l0.b(keyEvent))).booleanValue()) {
                long d3 = K1.f.d(keyEvent.getKeyCode());
                if (!C0813a.a(d3, Y.f11583b) && !C0813a.a(d3, Y.q)) {
                    if (!C0813a.a(d3, Y.f11585d)) {
                        if (!C0813a.a(d3, Y.f11587f)) {
                            if (C0813a.a(d3, Y.f11582a)) {
                                return 26;
                            }
                            if (!C0813a.a(d3, Y.f11586e)) {
                                return C0813a.a(d3, Y.f11588g) ? 46 : 0;
                            }
                        }
                        return 19;
                    }
                    return 18;
                }
                return 17;
            }
            if (keyEvent.isCtrlPressed()) {
                return 0;
            }
            if (keyEvent.isShiftPressed()) {
                long d4 = K1.f.d(keyEvent.getKeyCode());
                if (C0813a.a(d4, Y.f11590i)) {
                    return 27;
                }
                if (C0813a.a(d4, Y.f11591j)) {
                    return 28;
                }
                if (C0813a.a(d4, Y.f11592k)) {
                    return 29;
                }
                if (C0813a.a(d4, Y.f11593l)) {
                    return 30;
                }
                if (C0813a.a(d4, Y.f11594m)) {
                    return 31;
                }
                if (C0813a.a(d4, Y.f11595n)) {
                    return 32;
                }
                if (C0813a.a(d4, Y.f11596o)) {
                    return 39;
                }
                if (C0813a.a(d4, Y.f11597p)) {
                    return 40;
                }
                if (!C0813a.a(d4, Y.q)) {
                    return 0;
                }
            } else {
                long d5 = K1.f.d(keyEvent.getKeyCode());
                if (C0813a.a(d5, Y.f11590i)) {
                    return 1;
                }
                if (C0813a.a(d5, Y.f11591j)) {
                    return 2;
                }
                if (C0813a.a(d5, Y.f11592k)) {
                    return 11;
                }
                if (C0813a.a(d5, Y.f11593l)) {
                    return 12;
                }
                if (C0813a.a(d5, Y.f11594m)) {
                    return 13;
                }
                if (C0813a.a(d5, Y.f11595n)) {
                    return 14;
                }
                if (C0813a.a(d5, Y.f11596o)) {
                    return 7;
                }
                if (C0813a.a(d5, Y.f11597p)) {
                    return 8;
                }
                if (C0813a.a(d5, Y.f11598r)) {
                    return 44;
                }
                if (C0813a.a(d5, Y.f11599s)) {
                    return 20;
                }
                if (C0813a.a(d5, Y.f11600t)) {
                    return 21;
                }
                if (!C0813a.a(d5, Y.f11601u)) {
                    if (!C0813a.a(d5, Y.f11602v)) {
                        if (!C0813a.a(d5, Y.f11603w)) {
                            return C0813a.a(d5, Y.f11604x) ? 45 : 0;
                        }
                        return 17;
                    }
                    return 19;
                }
            }
            return 18;
        }
        if (!C0813a.a(K1.f.d(keyEvent.getKeyCode()), Y.f11588g)) {
            return 0;
        }
        return 47;
    }
}
