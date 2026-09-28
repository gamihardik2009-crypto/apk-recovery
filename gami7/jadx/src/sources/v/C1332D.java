package v;

import J.C0257c;
import J.C0274k0;
import J.W;
import J.W0;

/* renamed from: v.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1332D implements W0 {

    /* renamed from: h, reason: collision with root package name */
    public final int f11275h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11276i;

    /* renamed from: j, reason: collision with root package name */
    public final C0274k0 f11277j;

    /* renamed from: k, reason: collision with root package name */
    public int f11278k;

    public C1332D(int i2, int i3, int i4) {
        this.f11275h = i3;
        this.f11276i = i4;
        int i5 = (i2 / i3) * i3;
        this.f11277j = C0257c.N(B1.C.m0(Math.max(i5 - i4, 0), i5 + i3 + i4), W.f4109m);
        this.f11278k = i2;
    }

    public final void a(int i2) {
        if (i2 != this.f11278k) {
            this.f11278k = i2;
            int i3 = this.f11275h;
            int i4 = (i2 / i3) * i3;
            int i5 = this.f11276i;
            this.f11277j.setValue(B1.C.m0(Math.max(i4 - i5, 0), i4 + i3 + i5));
        }
    }

    @Override // J.W0
    public final Object getValue() {
        return (E2.d) this.f11277j.getValue();
    }
}
