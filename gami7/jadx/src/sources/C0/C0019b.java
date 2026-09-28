package C0;

import D0.C0058b;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import c0.AbstractC0571K;
import c0.AbstractC0585d;
import c0.AbstractC0598q;
import c0.C0575O;
import c0.InterfaceC0600s;
import e0.AbstractC0655e;
import java.util.List;

/* renamed from: C0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0019b {

    /* renamed from: a, reason: collision with root package name */
    public final K0.d f482a;

    /* renamed from: b, reason: collision with root package name */
    public final int f483b;

    /* renamed from: c, reason: collision with root package name */
    public final long f484c;

    /* renamed from: d, reason: collision with root package name */
    public final D0.D f485d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f486e;

    /* renamed from: f, reason: collision with root package name */
    public final List f487f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022c  */
    /* JADX WARN: Type inference failed for: r0v38, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0019b(K0.d r25, int r26, boolean r27, long r28) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.C0019b.<init>(K0.d, int, boolean, long):void");
    }

    public final D0.D a(int i2, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, int i6, int i7, int i8) {
        v vVar;
        float d3 = d();
        K0.d dVar = this.f482a;
        K0.e eVar = dVar.f4508g;
        K0.a aVar = K0.b.f4499a;
        x xVar = dVar.f4503b.f477c;
        return new D0.D(this.f486e, d3, eVar, i2, truncateAt, dVar.f4513l, (xVar == null || (vVar = xVar.f559b) == null) ? false : vVar.f555a, i4, i6, i7, i8, i5, i3, dVar.f4510i);
    }

    public final float b() {
        return this.f485d.a();
    }

    public final long c(b0.d dVar, int i2, E e3) {
        E0.e cVar;
        int i3;
        char c3;
        int[] iArr;
        RectF z3 = AbstractC0571K.z(dVar);
        int i4 = (!(i2 == 0) && i2 == 1) ? 1 : 0;
        C0018a c0018a = new C0018a(0, e3);
        int i5 = Build.VERSION.SDK_INT;
        D0.D d3 = this.f485d;
        if (i5 >= 34) {
            d3.getClass();
            iArr = C0058b.f963a.a(d3, z3, i4, c0018a);
            c3 = 1;
        } else {
            Q1.e c4 = d3.c();
            Layout layout = d3.f949f;
            if (i4 == 1) {
                cVar = new K1.l(layout.getText(), 1, d3.j());
            } else {
                CharSequence text = layout.getText();
                cVar = i5 >= 29 ? new E0.c(text, d3.f944a) : new E0.d(text);
            }
            E0.e eVar = cVar;
            int lineForVertical = layout.getLineForVertical((int) z3.top);
            if (z3.top <= d3.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < d3.f950g) {
                int i6 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) z3.bottom);
                if (lineForVertical2 != 0 || z3.bottom >= d3.g(0)) {
                    int d4 = D0.y.d(d3, layout, c4, i6, z3, eVar, c0018a, true);
                    while (true) {
                        i3 = i6;
                        if (d4 != -1 || i3 >= lineForVertical2) {
                            break;
                        }
                        i6 = i3 + 1;
                        d4 = D0.y.d(d3, layout, c4, i6, z3, eVar, c0018a, true);
                    }
                    if (d4 != -1) {
                        int i7 = i3;
                        int i8 = d4;
                        int d5 = D0.y.d(d3, layout, c4, lineForVertical2, z3, eVar, c0018a, false);
                        int i9 = lineForVertical2;
                        while (d5 == -1) {
                            int i10 = i7;
                            if (i10 >= i9) {
                                break;
                            }
                            int i11 = i9 - 1;
                            d5 = D0.y.d(d3, layout, c4, i11, z3, eVar, c0018a, false);
                            i7 = i10;
                            i9 = i11;
                        }
                        if (d5 == -1) {
                            iArr = null;
                            c3 = 1;
                        } else {
                            c3 = 1;
                            iArr = new int[]{eVar.a(i8 + 1), eVar.b(d5 - 1)};
                        }
                    }
                }
            }
            c3 = 1;
            iArr = null;
        }
        return iArr == null ? J.f471b : B1.C.j(iArr[0], iArr[c3]);
    }

    public final float d() {
        return O0.a.h(this.f484c);
    }

    public final void e(InterfaceC0600s interfaceC0600s) {
        Canvas a3 = AbstractC0585d.a(interfaceC0600s);
        D0.D d3 = this.f485d;
        if (d3.f947d) {
            a3.save();
            a3.clipRect(0.0f, 0.0f, d(), b());
        }
        if (a3.getClipBounds(d3.f959p)) {
            int i2 = d3.f951h;
            if (i2 != 0) {
                a3.translate(0.0f, i2);
            }
            D0.C c3 = D0.E.f960a;
            c3.f943a = a3;
            d3.f949f.draw(c3);
            if (i2 != 0) {
                a3.translate(0.0f, (-1) * i2);
            }
        }
        if (d3.f947d) {
            a3.restore();
        }
    }

    public final void f(InterfaceC0600s interfaceC0600s, long j3, C0575O c0575o, N0.j jVar, AbstractC0655e abstractC0655e, int i2) {
        K0.d dVar = this.f482a;
        K0.e eVar = dVar.f4508g;
        int i3 = eVar.f4516c;
        eVar.d(j3);
        eVar.f(c0575o);
        eVar.g(jVar);
        eVar.e(abstractC0655e);
        eVar.b(i2);
        e(interfaceC0600s);
        dVar.f4508g.b(i3);
    }

    public final void g(InterfaceC0600s interfaceC0600s, AbstractC0598q abstractC0598q, float f3, C0575O c0575o, N0.j jVar, AbstractC0655e abstractC0655e, int i2) {
        K0.d dVar = this.f482a;
        K0.e eVar = dVar.f4508g;
        int i3 = eVar.f4516c;
        eVar.c(abstractC0598q, B1.C.i(d(), b()), f3);
        eVar.f(c0575o);
        eVar.g(jVar);
        eVar.e(abstractC0655e);
        eVar.b(i2);
        e(interfaceC0600s);
        dVar.f4508g.b(i3);
    }
}
