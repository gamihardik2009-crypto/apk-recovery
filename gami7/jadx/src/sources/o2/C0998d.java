package o2;

import h1.AbstractC0699c;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0998d extends AbstractC0699c implements Iterator, A2.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9336l;

    public C0998d(C1000f c1000f, int i2) {
        this.f9336l = i2;
        z2.h.f(c1000f, "map");
        this.f7787k = c1000f;
        this.f7785i = -1;
        this.f7786j = c1000f.f9347o;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9336l) {
            case 0:
                b();
                int i2 = this.f7784h;
                C1000f c1000f = (C1000f) this.f7787k;
                if (i2 >= c1000f.f9345m) {
                    throw new NoSuchElementException();
                }
                this.f7784h = i2 + 1;
                this.f7785i = i2;
                C0999e c0999e = new C0999e(c1000f, i2);
                e();
                return c0999e;
            case 1:
                b();
                int i3 = this.f7784h;
                C1000f c1000f2 = (C1000f) this.f7787k;
                if (i3 >= c1000f2.f9345m) {
                    throw new NoSuchElementException();
                }
                this.f7784h = i3 + 1;
                this.f7785i = i3;
                Object obj = c1000f2.f9340h[i3];
                e();
                return obj;
            default:
                b();
                int i4 = this.f7784h;
                C1000f c1000f3 = (C1000f) this.f7787k;
                if (i4 >= c1000f3.f9345m) {
                    throw new NoSuchElementException();
                }
                this.f7784h = i4 + 1;
                this.f7785i = i4;
                Object[] objArr = c1000f3.f9341i;
                z2.h.c(objArr);
                Object obj2 = objArr[this.f7785i];
                e();
                return obj2;
        }
    }
}
