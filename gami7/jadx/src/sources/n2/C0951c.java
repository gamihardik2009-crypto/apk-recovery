package n2;

import java.util.RandomAccess;
import t0.AbstractC1265x;

/* renamed from: n2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0951c extends AbstractC0952d implements RandomAccess {

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC0952d f9155i;

    /* renamed from: j, reason: collision with root package name */
    public final int f9156j;

    /* renamed from: k, reason: collision with root package name */
    public final int f9157k;

    public C0951c(AbstractC0952d abstractC0952d, int i2, int i3) {
        z2.h.f(abstractC0952d, "list");
        this.f9155i = abstractC0952d;
        this.f9156j = i2;
        AbstractC0949a.g(i2, i3, abstractC0952d.a());
        this.f9157k = i3 - i2;
    }

    @Override // m2.AbstractC0872n
    public final int a() {
        return this.f9157k;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        int i3 = this.f9157k;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(AbstractC1265x.d(i2, i3, "index: ", ", size: "));
        }
        return this.f9155i.get(this.f9156j + i2);
    }
}
