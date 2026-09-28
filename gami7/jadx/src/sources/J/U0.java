package J;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class U0 implements Iterable, A2.a {

    /* renamed from: h, reason: collision with root package name */
    public final E0 f4100h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4101i;

    /* renamed from: j, reason: collision with root package name */
    public final C0257c f4102j;

    public U0(E0 e02, int i2, M m3, C0257c c0257c) {
        this.f4100h = e02;
        this.f4101i = i2;
        this.f4102j = c0257c;
        m3.getClass();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new L(this.f4100h, this.f4101i, null, this.f4102j);
    }
}
