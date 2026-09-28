package m;

import j.C0767w;
import m2.C0880v;
import n2.AbstractC0959k;

/* loaded from: classes.dex */
public final class L extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8326i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ W f8327j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(W w2, int i2) {
        super(1);
        this.f8326i = i2;
        this.f8327j = w2;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f8326i) {
            case 0:
                long longValue = ((Number) obj).longValue();
                W w2 = this.f8327j;
                long j3 = longValue - w2.f8381s;
                w2.f8381s = longValue;
                long E = B2.a.E(j3 / w2.f8385w);
                C0767w c0767w = w2.f8382t;
                int i2 = c0767w.f8058b;
                int i3 = 0;
                if (i2 != 0) {
                    Object[] objArr = c0767w.f8057a;
                    for (int i4 = 0; i4 < i2; i4++) {
                        K k3 = (K) objArr[i4];
                        W.n(w2, k3, E);
                        k3.f8320c = true;
                    }
                    p0 p0Var = w2.f8375l;
                    if (p0Var != null) {
                        p0Var.p();
                    }
                    int i5 = c0767w.f8058b;
                    Object[] objArr2 = c0767w.f8057a;
                    E2.d m02 = B1.C.m0(0, i5);
                    int i6 = m02.f1076h;
                    int i7 = m02.f1077i;
                    if (i6 <= i7) {
                        while (true) {
                            objArr2[i6 - i3] = objArr2[i6];
                            if (((K) objArr2[i6]).f8320c) {
                                i3++;
                            }
                            if (i6 != i7) {
                                i6++;
                            }
                        }
                    }
                    AbstractC0959k.u(objArr2, null, i5 - i3, i5);
                    c0767w.f8058b -= i3;
                }
                K k4 = w2.f8383u;
                if (k4 != null) {
                    k4.f8324g = w2.f8376m;
                    W.n(w2, k4, E);
                    w2.v(k4.f8321d);
                    if (k4.f8321d == 1.0f) {
                        w2.f8383u = null;
                    }
                    w2.u();
                }
                break;
            default:
                this.f8327j.f8381s = ((Number) obj).longValue();
                break;
        }
        return C0880v.f8657a;
    }
}
