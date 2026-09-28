package M;

import java.util.List;
import m2.AbstractC0872n;
import n2.AbstractC0952d;

/* loaded from: classes.dex */
public final class a extends AbstractC0952d implements b {

    /* renamed from: i, reason: collision with root package name */
    public final b f4749i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4750j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4751k;

    /* JADX WARN: Multi-variable type inference failed */
    public a(b bVar, int i2, int i3) {
        this.f4749i = bVar;
        this.f4750j = i2;
        l0.c.t(i2, i3, ((AbstractC0872n) bVar).a());
        this.f4751k = i3 - i2;
    }

    @Override // m2.AbstractC0872n
    public final int a() {
        return this.f4751k;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        l0.c.q(i2, this.f4751k);
        return this.f4749i.get(this.f4750j + i2);
    }

    @Override // n2.AbstractC0952d, java.util.List
    public final List subList(int i2, int i3) {
        l0.c.t(i2, i3, this.f4751k);
        int i4 = this.f4750j;
        return new a(this.f4749i, i2 + i4, i4 + i3);
    }
}
