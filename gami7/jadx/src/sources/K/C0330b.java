package K;

import J.AbstractC0254a0;
import J.AbstractC0288s;
import J.C0255b;
import J.C0257c;
import J.C0285q;
import J.N;
import J.V0;
import J.Z;
import java.util.ArrayList;

/* renamed from: K.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0330b {

    /* renamed from: a, reason: collision with root package name */
    public final C0285q f4458a;

    /* renamed from: b, reason: collision with root package name */
    public C0329a f4459b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4460c;

    /* renamed from: f, reason: collision with root package name */
    public int f4463f;

    /* renamed from: g, reason: collision with root package name */
    public int f4464g;

    /* renamed from: l, reason: collision with root package name */
    public int f4469l;

    /* renamed from: d, reason: collision with root package name */
    public final N f4461d = new N();

    /* renamed from: e, reason: collision with root package name */
    public boolean f4462e = true;

    /* renamed from: h, reason: collision with root package name */
    public final V0 f4465h = new V0(0);

    /* renamed from: i, reason: collision with root package name */
    public int f4466i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f4467j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f4468k = -1;

    public C0330b(C0285q c0285q, C0329a c0329a) {
        this.f4458a = c0285q;
        this.f4459b = c0329a;
    }

    public final void a(ArrayList arrayList, R.c cVar) {
        C0329a c0329a = this.f4459b;
        c0329a.getClass();
        if (!arrayList.isEmpty()) {
            C0335g c0335g = C0335g.f4475c;
            H h2 = c0329a.f4457h;
            h2.P(c0335g);
            B1.C.k0(h2, 1, arrayList);
            B1.C.k0(h2, 0, cVar);
            int i2 = h2.f4455n;
            int i3 = c0335g.f4447a;
            int I3 = H.I(h2, i3);
            int i4 = c0335g.f4448b;
            if (i2 == I3 && h2.f4456o == H.I(h2, i4)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i5 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                if (((1 << i6) & h2.f4455n) != 0) {
                    if (i5 > 0) {
                        sb.append(", ");
                    }
                    sb.append(c0335g.b(i6));
                    i5++;
                }
            }
            String sb2 = sb.toString();
            StringBuilder m3 = B1.t.m(sb2, "StringBuilder().apply(builderAction).toString()");
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                if (((1 << i8) & h2.f4456o) != 0) {
                    if (i5 > 0) {
                        m3.append(", ");
                    }
                    m3.append(c0335g.c(i8));
                    i7++;
                }
            }
            String sb3 = m3.toString();
            z2.h.e(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(c0335g);
            sb4.append(". Not all arguments were provided. Missing ");
            B1.t.x(sb4, i5, " int arguments (", sb2, ") and ");
            B1.t.z(sb4, i7, " object arguments (", sb3, ").");
            throw null;
        }
    }

    public final void b(Z z3, AbstractC0288s abstractC0288s, AbstractC0254a0 abstractC0254a0, AbstractC0254a0 abstractC0254a02) {
        C0329a c0329a = this.f4459b;
        c0329a.getClass();
        C0336h c0336h = C0336h.f4476c;
        H h2 = c0329a.f4457h;
        h2.P(c0336h);
        B1.C.k0(h2, 0, z3);
        B1.C.k0(h2, 1, abstractC0288s);
        B1.C.k0(h2, 3, abstractC0254a02);
        B1.C.k0(h2, 2, abstractC0254a0);
        int i2 = h2.f4455n;
        int i3 = c0336h.f4447a;
        int I3 = H.I(h2, i3);
        int i4 = c0336h.f4448b;
        if (i2 == I3 && h2.f4456o == H.I(h2, i4)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            if (((1 << i6) & h2.f4455n) != 0) {
                if (i5 > 0) {
                    sb.append(", ");
                }
                sb.append(c0336h.b(i6));
                i5++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder m3 = B1.t.m(sb2, "StringBuilder().apply(builderAction).toString()");
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            if (((1 << i8) & h2.f4456o) != 0) {
                if (i5 > 0) {
                    m3.append(", ");
                }
                m3.append(c0336h.c(i8));
                i7++;
            }
        }
        String sb3 = m3.toString();
        z2.h.e(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(c0336h);
        sb4.append(". Not all arguments were provided. Missing ");
        B1.t.x(sb4, i5, " int arguments (", sb2, ") and ");
        B1.t.z(sb4, i7, " object arguments (", sb3, ").");
        throw null;
    }

    public final void c(R.c cVar, C0255b c0255b) {
        f();
        C0329a c0329a = this.f4459b;
        c0329a.getClass();
        j jVar = j.f4478c;
        H h2 = c0329a.f4457h;
        h2.P(jVar);
        B1.C.k0(h2, 0, cVar);
        B1.C.k0(h2, 1, c0255b);
        int i2 = h2.f4455n;
        int i3 = jVar.f4447a;
        int I3 = H.I(h2, i3);
        int i4 = jVar.f4448b;
        if (i2 == I3 && h2.f4456o == H.I(h2, i4)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            if (((1 << i6) & h2.f4455n) != 0) {
                if (i5 > 0) {
                    sb.append(", ");
                }
                sb.append(jVar.b(i6));
                i5++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder m3 = B1.t.m(sb2, "StringBuilder().apply(builderAction).toString()");
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            if (((1 << i8) & h2.f4456o) != 0) {
                if (i5 > 0) {
                    m3.append(", ");
                }
                m3.append(jVar.c(i8));
                i7++;
            }
        }
        String sb3 = m3.toString();
        z2.h.e(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(jVar);
        sb4.append(". Not all arguments were provided. Missing ");
        B1.t.x(sb4, i5, " int arguments (", sb2, ") and ");
        B1.t.z(sb4, i7, " object arguments (", sb3, ").");
        throw null;
    }

    public final void d(C0329a c0329a, R.c cVar) {
        C0329a c0329a2 = this.f4459b;
        c0329a2.getClass();
        if (c0329a.f4457h.M()) {
            C0334f c0334f = C0334f.f4474c;
            H h2 = c0329a2.f4457h;
            h2.P(c0334f);
            B1.C.k0(h2, 0, c0329a);
            B1.C.k0(h2, 1, cVar);
            int i2 = h2.f4455n;
            int i3 = c0334f.f4447a;
            int I3 = H.I(h2, i3);
            int i4 = c0334f.f4448b;
            if (i2 == I3 && h2.f4456o == H.I(h2, i4)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i5 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                if (((1 << i6) & h2.f4455n) != 0) {
                    if (i5 > 0) {
                        sb.append(", ");
                    }
                    sb.append(c0334f.b(i6));
                    i5++;
                }
            }
            String sb2 = sb.toString();
            StringBuilder m3 = B1.t.m(sb2, "StringBuilder().apply(builderAction).toString()");
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                if (((1 << i8) & h2.f4456o) != 0) {
                    if (i5 > 0) {
                        m3.append(", ");
                    }
                    m3.append(c0334f.c(i8));
                    i7++;
                }
            }
            String sb3 = m3.toString();
            z2.h.e(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(c0334f);
            sb4.append(". Not all arguments were provided. Missing ");
            B1.t.x(sb4, i5, " int arguments (", sb2, ") and ");
            B1.t.z(sb4, i7, " object arguments (", sb3, ").");
            throw null;
        }
    }

    public final void e() {
        g();
        V0 v0 = this.f4465h;
        if (!(!v0.f4104h.isEmpty())) {
            this.f4464g++;
        } else {
            v0.f4104h.remove(r0.size() - 1);
        }
    }

    public final void f() {
        C0330b c0330b = this;
        int i2 = c0330b.f4464g;
        int i3 = 0;
        if (i2 > 0) {
            C0329a c0329a = c0330b.f4459b;
            c0329a.getClass();
            E e3 = E.f4445c;
            H h2 = c0329a.f4457h;
            h2.P(e3);
            B1.C.j0(h2, 0, i2);
            int i4 = h2.f4455n;
            int i5 = e3.f4447a;
            int I3 = H.I(h2, i5);
            int i6 = e3.f4448b;
            if (i4 != I3 || h2.f4456o != H.I(h2, i6)) {
                StringBuilder sb = new StringBuilder();
                int i7 = 0;
                while (i7 < i5) {
                    int i8 = i5;
                    if (((1 << i7) & h2.f4455n) != 0) {
                        if (i3 > 0) {
                            sb.append(", ");
                        }
                        sb.append(e3.b(i7));
                        i3++;
                    }
                    i7++;
                    i5 = i8;
                }
                String sb2 = sb.toString();
                StringBuilder m3 = B1.t.m(sb2, "StringBuilder().apply(builderAction).toString()");
                int i9 = 0;
                int i10 = 0;
                while (i10 < i6) {
                    int i11 = i6;
                    if (((1 << i10) & h2.f4456o) != 0) {
                        if (i3 > 0) {
                            m3.append(", ");
                        }
                        m3.append(e3.c(i10));
                        i9++;
                    }
                    i10++;
                    i6 = i11;
                }
                String sb3 = m3.toString();
                z2.h.e(sb3, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb4 = new StringBuilder("Error while pushing ");
                sb4.append(e3);
                sb4.append(". Not all arguments were provided. Missing ");
                B1.t.x(sb4, i3, " int arguments (", sb2, ") and ");
                B1.t.z(sb4, i9, " object arguments (", sb3, ").");
                throw null;
            }
            c0330b.f4464g = 0;
        } else {
            c0330b = this;
        }
        V0 v0 = c0330b.f4465h;
        if (!v0.f4104h.isEmpty()) {
            C0329a c0329a2 = c0330b.f4459b;
            ArrayList arrayList = v0.f4104h;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i12 = 0; i12 < size; i12++) {
                objArr[i12] = arrayList.get(i12);
            }
            c0329a2.getClass();
            if (!(size == 0)) {
                k kVar = k.f4479c;
                H h3 = c0329a2.f4457h;
                h3.P(kVar);
                B1.C.k0(h3, 0, objArr);
                int i13 = h3.f4455n;
                int i14 = kVar.f4447a;
                int I4 = H.I(h3, i14);
                int i15 = kVar.f4448b;
                if (i13 != I4 || h3.f4456o != H.I(h3, i15)) {
                    StringBuilder sb5 = new StringBuilder();
                    int i16 = 0;
                    for (int i17 = 0; i17 < i14; i17++) {
                        if (((1 << i17) & h3.f4455n) != 0) {
                            if (i16 > 0) {
                                sb5.append(", ");
                            }
                            sb5.append(kVar.b(i17));
                            i16++;
                        }
                    }
                    String sb6 = sb5.toString();
                    StringBuilder m4 = B1.t.m(sb6, "StringBuilder().apply(builderAction).toString()");
                    int i18 = 0;
                    int i19 = 0;
                    while (i18 < i15) {
                        int i20 = i15;
                        if (((1 << i18) & h3.f4456o) != 0) {
                            if (i16 > 0) {
                                m4.append(", ");
                            }
                            m4.append(kVar.c(i18));
                            i19++;
                        }
                        i18++;
                        i15 = i20;
                    }
                    String sb7 = m4.toString();
                    z2.h.e(sb7, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb8 = new StringBuilder("Error while pushing ");
                    sb8.append(kVar);
                    sb8.append(". Not all arguments were provided. Missing ");
                    B1.t.x(sb8, i16, " int arguments (", sb6, ") and ");
                    B1.t.z(sb8, i19, " object arguments (", sb7, ").");
                    throw null;
                }
            }
            arrayList.clear();
        }
    }

    public final void g() {
        int i2 = this.f4469l;
        if (i2 > 0) {
            int i3 = this.f4466i;
            if (i3 >= 0) {
                f();
                C0329a c0329a = this.f4459b;
                c0329a.getClass();
                x xVar = x.f4496c;
                H h2 = c0329a.f4457h;
                h2.P(xVar);
                B1.C.j0(h2, 0, i3);
                B1.C.j0(h2, 1, i2);
                int i4 = h2.f4455n;
                int i5 = xVar.f4447a;
                int I3 = H.I(h2, i5);
                int i6 = xVar.f4448b;
                if (i4 != I3 || h2.f4456o != H.I(h2, i6)) {
                    StringBuilder sb = new StringBuilder();
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < i5) {
                        int i9 = i5;
                        if (((1 << i7) & h2.f4455n) != 0) {
                            if (i8 > 0) {
                                sb.append(", ");
                            }
                            sb.append(xVar.b(i7));
                            i8++;
                        }
                        i7++;
                        i5 = i9;
                    }
                    String sb2 = sb.toString();
                    StringBuilder m3 = B1.t.m(sb2, "StringBuilder().apply(builderAction).toString()");
                    int i10 = 0;
                    int i11 = 0;
                    while (i11 < i6) {
                        int i12 = i6;
                        if (((1 << i11) & h2.f4456o) != 0) {
                            if (i8 > 0) {
                                m3.append(", ");
                            }
                            m3.append(xVar.c(i11));
                            i10++;
                        }
                        i11++;
                        i6 = i12;
                    }
                    String sb3 = m3.toString();
                    z2.h.e(sb3, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb4 = new StringBuilder("Error while pushing ");
                    sb4.append(xVar);
                    sb4.append(". Not all arguments were provided. Missing ");
                    B1.t.x(sb4, i8, " int arguments (", sb2, ") and ");
                    B1.t.z(sb4, i10, " object arguments (", sb3, ").");
                    throw null;
                }
                this.f4466i = -1;
            } else {
                int i13 = this.f4468k;
                int i14 = this.f4467j;
                f();
                C0329a c0329a2 = this.f4459b;
                c0329a2.getClass();
                u uVar = u.f4493c;
                H h3 = c0329a2.f4457h;
                h3.P(uVar);
                B1.C.j0(h3, 1, i13);
                B1.C.j0(h3, 0, i14);
                B1.C.j0(h3, 2, i2);
                int i15 = h3.f4455n;
                int i16 = uVar.f4447a;
                int I4 = H.I(h3, i16);
                int i17 = uVar.f4448b;
                if (i15 != I4 || h3.f4456o != H.I(h3, i17)) {
                    int i18 = 0;
                    StringBuilder sb5 = new StringBuilder();
                    for (int i19 = 0; i19 < i16; i19++) {
                        if (((1 << i19) & h3.f4455n) != 0) {
                            if (i18 > 0) {
                                sb5.append(", ");
                            }
                            sb5.append(uVar.b(i19));
                            i18++;
                        }
                    }
                    String sb6 = sb5.toString();
                    StringBuilder m4 = B1.t.m(sb6, "StringBuilder().apply(builderAction).toString()");
                    int i20 = 0;
                    int i21 = 0;
                    while (i20 < i17) {
                        int i22 = i17;
                        if (((1 << i20) & h3.f4456o) != 0) {
                            if (i18 > 0) {
                                m4.append(", ");
                            }
                            m4.append(uVar.c(i20));
                            i21++;
                        }
                        i20++;
                        i17 = i22;
                    }
                    String sb7 = m4.toString();
                    z2.h.e(sb7, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb8 = new StringBuilder("Error while pushing ");
                    sb8.append(uVar);
                    sb8.append(". Not all arguments were provided. Missing ");
                    B1.t.x(sb8, i18, " int arguments (", sb6, ") and ");
                    B1.t.z(sb8, i21, " object arguments (", sb7, ").");
                    throw null;
                }
                this.f4467j = -1;
                this.f4468k = -1;
            }
            this.f4469l = 0;
        }
    }

    public final void h(boolean z3) {
        C0285q c0285q = this.f4458a;
        int i2 = z3 ? c0285q.F.f3987i : c0285q.F.f3985g;
        int i3 = i2 - this.f4463f;
        if (!(i3 >= 0)) {
            C0257c.y("Tried to seek backward");
            throw null;
        }
        if (i3 > 0) {
            C0329a c0329a = this.f4459b;
            c0329a.getClass();
            C0332d c0332d = C0332d.f4472c;
            H h2 = c0329a.f4457h;
            h2.P(c0332d);
            B1.C.j0(h2, 0, i3);
            int i4 = h2.f4455n;
            int i5 = c0332d.f4447a;
            int I3 = H.I(h2, i5);
            int i6 = c0332d.f4448b;
            if (i4 == I3 && h2.f4456o == H.I(h2, i6)) {
                this.f4463f = i2;
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                if (((1 << i8) & h2.f4455n) != 0) {
                    if (i7 > 0) {
                        sb.append(", ");
                    }
                    sb.append(c0332d.b(i8));
                    i7++;
                }
            }
            String sb2 = sb.toString();
            StringBuilder m3 = B1.t.m(sb2, "StringBuilder().apply(builderAction).toString()");
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                if (((1 << i10) & h2.f4456o) != 0) {
                    if (i7 > 0) {
                        m3.append(", ");
                    }
                    m3.append(c0332d.c(i10));
                    i9++;
                }
            }
            String sb3 = m3.toString();
            z2.h.e(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(c0332d);
            sb4.append(". Not all arguments were provided. Missing ");
            B1.t.x(sb4, i7, " int arguments (", sb2, ") and ");
            B1.t.z(sb4, i9, " object arguments (", sb3, ").");
            throw null;
        }
    }

    public final void i(int i2, int i3) {
        if (i3 > 0) {
            if (!(i2 >= 0)) {
                C0257c.y("Invalid remove index " + i2);
                throw null;
            }
            if (this.f4466i == i2) {
                this.f4469l += i3;
                return;
            }
            g();
            this.f4466i = i2;
            this.f4469l = i3;
        }
    }
}
