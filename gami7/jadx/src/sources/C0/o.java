package C0;

import a.AbstractC0423a;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import c0.AbstractC0574N;
import c0.AbstractC0598q;
import c0.C0575O;
import c0.C0578S;
import c0.C0599r;
import c0.InterfaceC0600s;
import e0.AbstractC0655e;
import java.util.ArrayList;
import java.util.List;
import n2.AbstractC0961m;
import n2.AbstractC0963o;
import n2.AbstractC0968t;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Q1.e f523a;

    /* renamed from: b, reason: collision with root package name */
    public final int f524b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f525c;

    /* renamed from: d, reason: collision with root package name */
    public final float f526d;

    /* renamed from: e, reason: collision with root package name */
    public final float f527e;

    /* renamed from: f, reason: collision with root package name */
    public final int f528f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f529g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f530h;

    public o(Q1.e eVar, long j3, int i2, boolean z3) {
        boolean z4;
        int g3;
        this.f523a = eVar;
        this.f524b = i2;
        if (O0.a.j(j3) != 0 || O0.a.i(j3) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) eVar.f5281e;
        int size = arrayList2.size();
        int i3 = 0;
        int i4 = 0;
        float f3 = 0.0f;
        while (i3 < size) {
            r rVar = (r) arrayList2.get(i3);
            s sVar = rVar.f540a;
            int h2 = O0.a.h(j3);
            if (O0.a.c(j3)) {
                g3 = O0.a.g(j3) - ((int) Math.ceil(f3));
                if (g3 < 0) {
                    g3 = 0;
                }
            } else {
                g3 = O0.a.g(j3);
            }
            long c3 = B1.C.c(h2, g3, 5);
            int i5 = this.f524b - i4;
            z2.h.d(sVar, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
            C0019b c0019b = new C0019b((K0.d) sVar, i5, z3, c3);
            float b3 = c0019b.b() + f3;
            D0.D d3 = c0019b.f485d;
            int i6 = i4 + d3.f950g;
            arrayList.add(new q(c0019b, rVar.f541b, rVar.f542c, i4, i6, f3, b3));
            if (d3.f947d) {
                i4 = i6;
            } else {
                i4 = i6;
                if (i4 != this.f524b || i3 == AbstractC0963o.u((ArrayList) this.f523a.f5281e)) {
                    i3++;
                    f3 = b3;
                }
            }
            z4 = true;
            f3 = b3;
            break;
        }
        z4 = false;
        this.f527e = f3;
        this.f528f = i4;
        this.f525c = z4;
        this.f530h = arrayList;
        this.f526d = O0.a.h(j3);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i7 = 0; i7 < size2; i7++) {
            q qVar = (q) arrayList.get(i7);
            List list = qVar.f533a.f487f;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i8 = 0; i8 < size3; i8++) {
                b0.d dVar = (b0.d) list.get(i8);
                arrayList4.add(dVar != null ? dVar.i(K1.f.e(0.0f, qVar.f538f)) : null);
            }
            AbstractC0968t.B(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.f523a.f5278b).size()) {
            int size4 = ((List) this.f523a.f5278b).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i9 = 0; i9 < size4; i9++) {
                arrayList5.add(null);
            }
            arrayList3 = AbstractC0961m.R(arrayList3, arrayList5);
        }
        this.f529g = arrayList3;
    }

    public static void g(o oVar, InterfaceC0600s interfaceC0600s, long j3, C0575O c0575o, N0.j jVar, AbstractC0655e abstractC0655e) {
        oVar.getClass();
        interfaceC0600s.f();
        ArrayList arrayList = oVar.f530h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            q qVar = (q) arrayList.get(i2);
            qVar.f533a.f(interfaceC0600s, j3, c0575o, jVar, abstractC0655e, 3);
            interfaceC0600s.q(0.0f, qVar.f533a.b());
        }
        interfaceC0600s.b();
    }

    public static void h(o oVar, InterfaceC0600s interfaceC0600s, AbstractC0598q abstractC0598q, float f3, C0575O c0575o, N0.j jVar, AbstractC0655e abstractC0655e) {
        oVar.getClass();
        interfaceC0600s.f();
        ArrayList arrayList = oVar.f530h;
        if (arrayList.size() <= 1) {
            K0.j.b(oVar, interfaceC0600s, abstractC0598q, f3, c0575o, jVar, abstractC0655e, 3);
        } else if (abstractC0598q instanceof C0578S) {
            K0.j.b(oVar, interfaceC0600s, abstractC0598q, f3, c0575o, jVar, abstractC0655e, 3);
        } else if (abstractC0598q instanceof AbstractC0574N) {
            int size = arrayList.size();
            float f4 = 0.0f;
            float f5 = 0.0f;
            for (int i2 = 0; i2 < size; i2++) {
                q qVar = (q) arrayList.get(i2);
                f5 += qVar.f533a.b();
                f4 = Math.max(f4, qVar.f533a.d());
            }
            Shader b3 = ((AbstractC0574N) abstractC0598q).b(B1.C.i(f4, f5));
            Matrix matrix = new Matrix();
            b3.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                q qVar2 = (q) arrayList.get(i3);
                qVar2.f533a.g(interfaceC0600s, new C0599r(b3), f3, c0575o, jVar, abstractC0655e, 3);
                C0019b c0019b = qVar2.f533a;
                interfaceC0600s.q(0.0f, c0019b.b());
                matrix.setTranslate(0.0f, -c0019b.b());
                b3.setLocalMatrix(matrix);
            }
        }
        interfaceC0600s.b();
    }

    public final void a(long j3, float[] fArr) {
        i(J.e(j3));
        j(J.d(j3));
        z2.q qVar = new z2.q();
        qVar.f11907h = 0;
        AbstractC0423a.J(this.f530h, j3, new n(j3, fArr, qVar, new z2.p()));
    }

    public final float b(int i2) {
        k(i2);
        ArrayList arrayList = this.f530h;
        q qVar = (q) arrayList.get(AbstractC0423a.H(i2, arrayList));
        C0019b c0019b = qVar.f533a;
        return c0019b.f485d.e(i2 - qVar.f536d) + qVar.f538f;
    }

    public final int c(float f3) {
        ArrayList arrayList = this.f530h;
        q qVar = (q) arrayList.get(AbstractC0423a.I(arrayList, f3));
        int i2 = qVar.f535c - qVar.f534b;
        int i3 = qVar.f536d;
        if (i2 == 0) {
            return i3;
        }
        float f4 = f3 - qVar.f538f;
        D0.D d3 = qVar.f533a.f485d;
        return i3 + d3.f949f.getLineForVertical(((int) f4) - d3.f951h);
    }

    public final float d(int i2) {
        k(i2);
        ArrayList arrayList = this.f530h;
        q qVar = (q) arrayList.get(AbstractC0423a.H(i2, arrayList));
        C0019b c0019b = qVar.f533a;
        return c0019b.f485d.g(i2 - qVar.f536d) + qVar.f538f;
    }

    public final int e(long j3) {
        ArrayList arrayList = this.f530h;
        q qVar = (q) arrayList.get(AbstractC0423a.I(arrayList, b0.c.e(j3)));
        int i2 = qVar.f535c;
        int i3 = qVar.f534b;
        if (i2 - i3 == 0) {
            return i3;
        }
        long e3 = K1.f.e(b0.c.d(j3), b0.c.e(j3) - qVar.f538f);
        C0019b c0019b = qVar.f533a;
        c0019b.getClass();
        int e4 = (int) b0.c.e(e3);
        D0.D d3 = c0019b.f485d;
        int i4 = e4 - d3.f951h;
        Layout layout = d3.f949f;
        int lineForVertical = layout.getLineForVertical(i4);
        return i3 + layout.getOffsetForHorizontal(lineForVertical, (d3.b(lineForVertical) * (-1)) + b0.c.d(e3));
    }

    public final long f(b0.d dVar, int i2, E e3) {
        long j3;
        long j4;
        ArrayList arrayList = this.f530h;
        int I3 = AbstractC0423a.I(arrayList, dVar.f7061b);
        float f3 = ((q) arrayList.get(I3)).f539g;
        float f4 = dVar.f7063d;
        if (f3 >= f4 || I3 == AbstractC0963o.u(arrayList)) {
            q qVar = (q) arrayList.get(I3);
            return qVar.a(qVar.f533a.c(dVar.i(K1.f.e(0.0f, -qVar.f538f)), i2, e3), true);
        }
        int I4 = AbstractC0423a.I(arrayList, f4);
        long j5 = J.f471b;
        while (true) {
            j3 = J.f471b;
            if (!J.a(j5, j3) || I3 > I4) {
                break;
            }
            q qVar2 = (q) arrayList.get(I3);
            j5 = qVar2.a(qVar2.f533a.c(dVar.i(K1.f.e(0.0f, -qVar2.f538f)), i2, e3), true);
            I3++;
        }
        if (J.a(j5, j3)) {
            return j3;
        }
        while (true) {
            j4 = J.f471b;
            if (!J.a(j3, j4) || I3 > I4) {
                break;
            }
            q qVar3 = (q) arrayList.get(I4);
            j3 = qVar3.a(qVar3.f533a.c(dVar.i(K1.f.e(0.0f, -qVar3.f538f)), i2, e3), true);
            I4--;
        }
        return J.a(j3, j4) ? j5 : B1.C.j((int) (j5 >> 32), (int) (4294967295L & j3));
    }

    public final void i(int i2) {
        Q1.e eVar = this.f523a;
        if (i2 < 0 || i2 >= ((C0024g) eVar.f5277a).f500a.length()) {
            StringBuilder l3 = B1.t.l("offset(", i2, ") is out of bounds [0, ");
            l3.append(((C0024g) eVar.f5277a).f500a.length());
            l3.append(')');
            throw new IllegalArgumentException(l3.toString().toString());
        }
    }

    public final void j(int i2) {
        Q1.e eVar = this.f523a;
        if (i2 < 0 || i2 > ((C0024g) eVar.f5277a).f500a.length()) {
            StringBuilder l3 = B1.t.l("offset(", i2, ") is out of bounds [0, ");
            l3.append(((C0024g) eVar.f5277a).f500a.length());
            l3.append(']');
            throw new IllegalArgumentException(l3.toString().toString());
        }
    }

    public final void k(int i2) {
        int i3 = this.f528f;
        if (i2 < 0 || i2 >= i3) {
            throw new IllegalArgumentException(("lineIndex(" + i2 + ") is out of bounds [0, " + i3 + ')').toString());
        }
    }
}
