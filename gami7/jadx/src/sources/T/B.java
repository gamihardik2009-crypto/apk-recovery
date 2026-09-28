package T;

import J.C0261e;

/* loaded from: classes.dex */
public abstract class B implements A {

    /* renamed from: h, reason: collision with root package name */
    public final C0261e f5646h = new C0261e(0);

    public final boolean d(int i2) {
        return (i2 & this.f5646h.get()) != 0;
    }

    public final void f(int i2) {
        C0261e c0261e;
        int i3;
        do {
            c0261e = this.f5646h;
            i3 = c0261e.get();
            if ((i3 & i2) != 0) {
                return;
            }
        } while (!c0261e.compareAndSet(i3, i3 | i2));
    }
}
