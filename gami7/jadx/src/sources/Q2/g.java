package Q2;

import J2.S;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public abstract class g extends S {

    /* renamed from: j, reason: collision with root package name */
    public final b f5348j;

    public g(int i2, int i3, long j3, String str) {
        this.f5348j = new b(i2, i3, j3, str);
    }

    @Override // J2.AbstractC0324v
    public final void r(InterfaceC1078i interfaceC1078i, Runnable runnable) {
        b.c(this.f5348j, runnable, false, 6);
    }

    @Override // J2.AbstractC0324v
    public final void v(InterfaceC1078i interfaceC1078i, Runnable runnable) {
        b.c(this.f5348j, runnable, true, 2);
    }
}
