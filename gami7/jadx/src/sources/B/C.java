package B;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import c0.AbstractC0571K;
import c0.C0565E;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final y2.c f146a;

    /* renamed from: b, reason: collision with root package name */
    public final z f147b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f149d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f150e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f151f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f152g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f153h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f154i;

    /* renamed from: j, reason: collision with root package name */
    public I0.z f155j;

    /* renamed from: k, reason: collision with root package name */
    public C0.H f156k;

    /* renamed from: l, reason: collision with root package name */
    public I0.s f157l;

    /* renamed from: m, reason: collision with root package name */
    public b0.d f158m;

    /* renamed from: n, reason: collision with root package name */
    public b0.d f159n;

    /* renamed from: c, reason: collision with root package name */
    public final Object f148c = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f160o = new CursorAnchorInfo.Builder();

    /* renamed from: p, reason: collision with root package name */
    public final float[] f161p = C0565E.a();
    public final Matrix q = new Matrix();

    public C(C0004e c0004e, z zVar) {
        this.f146a = c0004e;
        this.f147b = zVar;
    }

    public final void a() {
        z zVar;
        N0.h hVar;
        CursorAnchorInfo.Builder builder;
        z zVar2 = this.f147b;
        if (zVar2.d().isActive((View) zVar2.f239c)) {
            float[] fArr = this.f161p;
            C0565E.d(fArr);
            this.f146a.l(new C0565E(fArr));
            b0.d dVar = this.f159n;
            z2.h.c(dVar);
            float f3 = -dVar.f7060a;
            b0.d dVar2 = this.f159n;
            z2.h.c(dVar2);
            C0565E.h(f3, -dVar2.f7061b, 0.0f, fArr);
            Matrix matrix = this.q;
            AbstractC0571K.u(matrix, fArr);
            I0.z zVar3 = this.f155j;
            z2.h.c(zVar3);
            I0.s sVar = this.f157l;
            z2.h.c(sVar);
            C0.H h2 = this.f156k;
            z2.h.c(h2);
            b0.d dVar3 = this.f158m;
            z2.h.c(dVar3);
            b0.d dVar4 = this.f159n;
            z2.h.c(dVar4);
            boolean z3 = this.f151f;
            boolean z4 = this.f152g;
            boolean z5 = this.f153h;
            boolean z6 = this.f154i;
            CursorAnchorInfo.Builder builder2 = this.f160o;
            builder2.reset();
            builder2.setMatrix(matrix);
            long j3 = zVar3.f3933b;
            int e3 = C0.J.e(j3);
            builder2.setSelectionRange(e3, C0.J.d(j3));
            N0.h hVar2 = N0.h.f4990i;
            if (!z3 || e3 < 0) {
                zVar = zVar2;
                hVar = hVar2;
                builder = builder2;
            } else {
                int l3 = sVar.l(e3);
                b0.d c3 = h2.c(l3);
                float B3 = B1.C.B(c3.f7060a, 0.0f, (int) (h2.f463c >> 32));
                boolean o3 = K1.f.o(dVar3, B3, c3.f7061b);
                boolean o4 = K1.f.o(dVar3, B3, c3.f7063d);
                boolean z7 = h2.a(l3) == hVar2;
                int i2 = (o3 || o4) ? 1 : 0;
                if (!o3 || !o4) {
                    i2 |= 2;
                }
                int i3 = z7 ? i2 | 4 : i2;
                float f4 = c3.f7061b;
                float f5 = c3.f7063d;
                hVar = hVar2;
                zVar = zVar2;
                builder = builder2;
                builder2.setInsertionMarkerLocation(B3, f4, f5, f5, i3);
            }
            if (z4) {
                C0.J j4 = zVar3.f3934c;
                int e4 = j4 != null ? C0.J.e(j4.f473a) : -1;
                int d3 = j4 != null ? C0.J.d(j4.f473a) : -1;
                if (e4 >= 0 && e4 < d3) {
                    builder.setComposingText(e4, zVar3.f3932a.f500a.subSequence(e4, d3));
                    int l4 = sVar.l(e4);
                    int l5 = sVar.l(d3);
                    float[] fArr2 = new float[(l5 - l4) * 4];
                    h2.f462b.a(B1.C.j(l4, l5), fArr2);
                    while (e4 < d3) {
                        int l6 = sVar.l(e4);
                        int i4 = (l6 - l4) * 4;
                        float f6 = fArr2[i4];
                        float f7 = fArr2[i4 + 1];
                        int i5 = l4;
                        float f8 = fArr2[i4 + 2];
                        float f9 = fArr2[i4 + 3];
                        int i6 = d3;
                        int i7 = (dVar3.f7062c <= f6 || f8 <= dVar3.f7060a || dVar3.f7063d <= f7 || f9 <= dVar3.f7061b) ? 0 : 1;
                        if (!K1.f.o(dVar3, f6, f7) || !K1.f.o(dVar3, f8, f9)) {
                            i7 |= 2;
                        }
                        if (h2.a(l6) == hVar) {
                            i7 |= 4;
                        }
                        builder.addCharacterBounds(e4, f6, f7, f8, f9, i7);
                        e4++;
                        l4 = i5;
                        d3 = i6;
                    }
                }
            }
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 33 && z5) {
                m.a(builder, dVar4);
            }
            if (i8 >= 34 && z6) {
                o.a(builder, h2, dVar3);
            }
            zVar.d().updateCursorAnchorInfo((View) zVar.f239c, builder.build());
            this.f150e = false;
        }
    }
}
