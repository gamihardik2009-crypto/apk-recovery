package n0;

import J2.InterfaceC0310g;
import j.C0757m;
import java.util.concurrent.CancellationException;
import m2.C0880v;
import p.C1021i;
import r0.InterfaceC1129r;
import v.C1359m;

/* renamed from: n0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0929h {

    /* renamed from: a, reason: collision with root package name */
    public final L.d f8942a;

    public C0929h(int i2) {
        switch (i2) {
            case 1:
                this.f8942a = new L.d(new C1021i[16]);
                break;
            case 2:
                this.f8942a = new L.d(new C1359m[16]);
                break;
            default:
                this.f8942a = new L.d(new C0928g[16]);
                break;
        }
    }

    public boolean a(C0757m c0757m, InterfaceC1129r interfaceC1129r, B.z zVar, boolean z3) {
        L.d dVar = this.f8942a;
        int i2 = dVar.f4620j;
        if (i2 <= 0) {
            return false;
        }
        Object[] objArr = dVar.f4618h;
        int i3 = 0;
        boolean z4 = false;
        do {
            z4 = ((C0928g) objArr[i3]).a(c0757m, interfaceC1129r, zVar, z3) || z4;
            i3++;
        } while (i3 < i2);
        return z4;
    }

    public void b(CancellationException cancellationException) {
        L.d dVar = this.f8942a;
        int i2 = dVar.f4620j;
        InterfaceC0310g[] interfaceC0310gArr = new InterfaceC0310g[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            interfaceC0310gArr[i3] = ((C1021i) dVar.f4618h[i3]).f9602b;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            interfaceC0310gArr[i4].H(cancellationException);
        }
        if (!dVar.k()) {
            throw new IllegalStateException("uncancelled requests present".toString());
        }
    }

    public void c(B.z zVar) {
        L.d dVar = this.f8942a;
        int i2 = dVar.f4620j;
        while (true) {
            i2--;
            if (-1 >= i2) {
                return;
            }
            if (((C0928g) dVar.f4618h[i2]).f8935c.f5120a == 0) {
                dVar.n(i2);
            }
        }
    }

    public void d() {
        int i2 = 0;
        while (true) {
            L.d dVar = this.f8942a;
            if (i2 >= dVar.f4620j) {
                return;
            }
            C0928g c0928g = (C0928g) dVar.f4618h[i2];
            if (c0928g.f8934b.f5869t) {
                i2++;
                c0928g.d();
            } else {
                c0928g.f();
                dVar.n(i2);
            }
        }
    }

    public void e() {
        L.d dVar = this.f8942a;
        int i2 = 0;
        int i3 = new E2.d(0, dVar.f4620j - 1, 1).f1077i;
        if (i3 >= 0) {
            while (true) {
                ((C1021i) dVar.f4618h[i2]).f9602b.t(C0880v.f8657a);
                if (i2 == i3) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        dVar.g();
    }
}
