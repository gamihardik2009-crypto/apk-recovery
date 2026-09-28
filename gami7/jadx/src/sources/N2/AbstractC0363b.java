package N2;

import java.util.Arrays;
import m2.C0880v;
import q2.InterfaceC1073d;

/* renamed from: N2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0363b {

    /* renamed from: h, reason: collision with root package name */
    public AbstractC0365d[] f5028h;

    /* renamed from: i, reason: collision with root package name */
    public int f5029i;

    /* renamed from: j, reason: collision with root package name */
    public int f5030j;

    /* renamed from: k, reason: collision with root package name */
    public F f5031k;

    public final AbstractC0365d e() {
        AbstractC0365d abstractC0365d;
        F f3;
        synchronized (this) {
            try {
                AbstractC0365d[] abstractC0365dArr = this.f5028h;
                if (abstractC0365dArr == null) {
                    abstractC0365dArr = h();
                    this.f5028h = abstractC0365dArr;
                } else if (this.f5029i >= abstractC0365dArr.length) {
                    Object[] copyOf = Arrays.copyOf(abstractC0365dArr, abstractC0365dArr.length * 2);
                    z2.h.e(copyOf, "copyOf(this, newSize)");
                    this.f5028h = (AbstractC0365d[]) copyOf;
                    abstractC0365dArr = (AbstractC0365d[]) copyOf;
                }
                int i2 = this.f5030j;
                do {
                    abstractC0365d = abstractC0365dArr[i2];
                    if (abstractC0365d == null) {
                        abstractC0365d = g();
                        abstractC0365dArr[i2] = abstractC0365d;
                    }
                    i2++;
                    if (i2 >= abstractC0365dArr.length) {
                        i2 = 0;
                    }
                } while (!abstractC0365d.a(this));
                this.f5030j = i2;
                this.f5029i++;
                f3 = this.f5031k;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (f3 != null) {
            f3.x(1);
        }
        return abstractC0365d;
    }

    public abstract AbstractC0365d g();

    public abstract AbstractC0365d[] h();

    public final void i(AbstractC0365d abstractC0365d) {
        F f3;
        int i2;
        InterfaceC1073d[] b3;
        synchronized (this) {
            try {
                int i3 = this.f5029i - 1;
                this.f5029i = i3;
                f3 = this.f5031k;
                if (i3 == 0) {
                    this.f5030j = 0;
                }
                z2.h.d(abstractC0365d, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b3 = abstractC0365d.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC1073d interfaceC1073d : b3) {
            if (interfaceC1073d != null) {
                interfaceC1073d.t(C0880v.f8657a);
            }
        }
        if (f3 != null) {
            f3.x(-1);
        }
    }

    public final F j() {
        F f3;
        synchronized (this) {
            f3 = this.f5031k;
            if (f3 == null) {
                int i2 = this.f5029i;
                f3 = new F(1, Integer.MAX_VALUE, 2);
                f3.d(Integer.valueOf(i2));
                this.f5031k = f3;
            }
        }
        return f3;
    }
}
