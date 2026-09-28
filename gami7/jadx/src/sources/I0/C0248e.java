package I0;

import C0.J;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import c0.AbstractC0571K;
import c0.C0565E;
import m2.InterfaceC0862d;
import u0.C1314v;
import u0.N;

/* renamed from: I0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0248e {

    /* renamed from: a, reason: collision with root package name */
    public final n0.v f3877a;

    /* renamed from: b, reason: collision with root package name */
    public final Q1.r f3878b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3880d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3881e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3882f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3883g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3884h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3885i;

    /* renamed from: j, reason: collision with root package name */
    public z f3886j;

    /* renamed from: k, reason: collision with root package name */
    public C0.H f3887k;

    /* renamed from: l, reason: collision with root package name */
    public s f3888l;

    /* renamed from: n, reason: collision with root package name */
    public b0.d f3890n;

    /* renamed from: o, reason: collision with root package name */
    public b0.d f3891o;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3879c = new Object();

    /* renamed from: m, reason: collision with root package name */
    public y2.c f3889m = C0247d.f3870k;

    /* renamed from: p, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f3892p = new CursorAnchorInfo.Builder();
    public final float[] q = C0565E.a();

    /* renamed from: r, reason: collision with root package name */
    public final Matrix f3893r = new Matrix();

    public C0248e(n0.v vVar, Q1.r rVar) {
        this.f3877a = vVar;
        this.f3878b = rVar;
    }

    public final void a() {
        Q1.r rVar;
        N0.h hVar;
        CursorAnchorInfo.Builder builder;
        Q1.r rVar2 = this.f3878b;
        if (((InputMethodManager) ((InterfaceC0862d) rVar2.f5323c).getValue()).isActive((View) rVar2.f5322b)) {
            y2.c cVar = this.f3889m;
            float[] fArr = this.q;
            cVar.l(new C0565E(fArr));
            C1314v c1314v = (C1314v) this.f3877a;
            c1314v.C();
            C0565E.g(fArr, c1314v.f11181S);
            float d3 = b0.c.d(c1314v.f11185W);
            float e3 = b0.c.e(c1314v.f11185W);
            float[] fArr2 = c1314v.f11180R;
            C0565E.d(fArr2);
            C0565E.h(d3, e3, 0.0f, fArr2);
            N.z(fArr, fArr2);
            Matrix matrix = this.f3893r;
            AbstractC0571K.u(matrix, fArr);
            z zVar = this.f3886j;
            z2.h.c(zVar);
            s sVar = this.f3888l;
            z2.h.c(sVar);
            C0.H h2 = this.f3887k;
            z2.h.c(h2);
            b0.d dVar = this.f3890n;
            z2.h.c(dVar);
            b0.d dVar2 = this.f3891o;
            z2.h.c(dVar2);
            boolean z3 = this.f3882f;
            boolean z4 = this.f3883g;
            boolean z5 = this.f3884h;
            boolean z6 = this.f3885i;
            CursorAnchorInfo.Builder builder2 = this.f3892p;
            builder2.reset();
            builder2.setMatrix(matrix);
            long j3 = zVar.f3933b;
            int e4 = J.e(j3);
            builder2.setSelectionRange(e4, J.d(j3));
            N0.h hVar2 = N0.h.f4990i;
            if (!z3 || e4 < 0) {
                rVar = rVar2;
                hVar = hVar2;
                builder = builder2;
            } else {
                int l3 = sVar.l(e4);
                b0.d c3 = h2.c(l3);
                float B3 = B1.C.B(c3.f7060a, 0.0f, (int) (h2.f463c >> 32));
                boolean p3 = K1.f.p(dVar, B3, c3.f7061b);
                boolean p4 = K1.f.p(dVar, B3, c3.f7063d);
                boolean z7 = h2.a(l3) == hVar2;
                int i2 = (p3 || p4) ? 1 : 0;
                if (!p3 || !p4) {
                    i2 |= 2;
                }
                int i3 = z7 ? i2 | 4 : i2;
                float f3 = c3.f7061b;
                float f4 = c3.f7063d;
                hVar = hVar2;
                rVar = rVar2;
                builder = builder2;
                builder2.setInsertionMarkerLocation(B3, f3, f4, f4, i3);
            }
            if (z4) {
                J j4 = zVar.f3934c;
                int e5 = j4 != null ? J.e(j4.f473a) : -1;
                int d4 = j4 != null ? J.d(j4.f473a) : -1;
                if (e5 >= 0 && e5 < d4) {
                    builder.setComposingText(e5, zVar.f3932a.f500a.subSequence(e5, d4));
                    int l4 = sVar.l(e5);
                    int l5 = sVar.l(d4);
                    float[] fArr3 = new float[(l5 - l4) * 4];
                    h2.f462b.a(B1.C.j(l4, l5), fArr3);
                    while (e5 < d4) {
                        int l6 = sVar.l(e5);
                        int i4 = (l6 - l4) * 4;
                        float f5 = fArr3[i4];
                        float f6 = fArr3[i4 + 1];
                        int i5 = d4;
                        float f7 = fArr3[i4 + 2];
                        float f8 = fArr3[i4 + 3];
                        int i6 = l4;
                        int i7 = (dVar.f7062c <= f5 || f7 <= dVar.f7060a || dVar.f7063d <= f6 || f8 <= dVar.f7061b) ? 0 : 1;
                        if (!K1.f.p(dVar, f5, f6) || !K1.f.p(dVar, f7, f8)) {
                            i7 |= 2;
                        }
                        if (h2.a(l6) == hVar) {
                            i7 |= 4;
                        }
                        builder.addCharacterBounds(e5, f5, f6, f7, f8, i7);
                        e5++;
                        d4 = i5;
                        l4 = i6;
                        fArr3 = fArr3;
                    }
                }
            }
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 33 && z5) {
                AbstractC0245b.a(builder, dVar2);
            }
            if (i8 >= 34 && z6) {
                AbstractC0246c.a(builder, h2, dVar);
            }
            CursorAnchorInfo build = builder.build();
            Q1.r rVar3 = rVar;
            ((InputMethodManager) ((InterfaceC0862d) rVar3.f5323c).getValue()).updateCursorAnchorInfo((View) rVar3.f5322b, build);
            this.f3881e = false;
        }
    }
}
