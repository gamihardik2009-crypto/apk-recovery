package j;

import n2.AbstractC0974z;

/* renamed from: j.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0743I extends AbstractC0974z {

    /* renamed from: h, reason: collision with root package name */
    public int f7980h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0742H f7981i;

    public C0743I(C0742H c0742h) {
        this.f7981i = c0742h;
    }

    @Override // n2.AbstractC0974z
    public final int a() {
        int i2 = this.f7980h;
        this.f7980h = i2 + 1;
        return this.f7981i.d(i2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7980h < this.f7981i.f();
    }
}
