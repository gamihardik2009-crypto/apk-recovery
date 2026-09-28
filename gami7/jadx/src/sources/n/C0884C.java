package n;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import c0.AbstractC0585d;
import c0.C0584c;
import c0.InterfaceC0600s;
import e0.C0652b;
import f0.AbstractC0667f;
import f0.C0663b;
import t0.C1238G;

/* renamed from: n.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0884C extends u0.N implements Z.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f8665f = 1;

    /* renamed from: g, reason: collision with root package name */
    public final C0905m f8666g;

    /* renamed from: h, reason: collision with root package name */
    public final C0885D f8667h;

    /* renamed from: i, reason: collision with root package name */
    public Object f8668i;

    public C0884C(C0905m c0905m, C0885D c0885d) {
        this.f8666g = c0905m;
        this.f8667h = c0885d;
    }

    public static boolean E(float f3, EdgeEffect edgeEffect, Canvas canvas) {
        if (f3 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f3);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static boolean F(float f3, long j3, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f3);
        canvas.translate(b0.c.d(j3), b0.c.e(j3));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public RenderNode G() {
        RenderNode renderNode = (RenderNode) this.f8668i;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode e3 = AbstractC0667f.e();
        this.f8668i = e3;
        return e3;
    }

    @Override // Z.e
    public final void g(C1238G c1238g) {
        RecordingCanvas beginRecording;
        float f3;
        boolean z3;
        float f4;
        float f5;
        switch (this.f8665f) {
            case 0:
                long e3 = c1238g.f10415h.e();
                C0905m c0905m = this.f8666g;
                c0905m.l(e3);
                C0652b c0652b = c1238g.f10415h;
                if (b0.f.e(c0652b.e())) {
                    c1238g.a();
                    return;
                }
                c1238g.a();
                c0905m.f8805j.getValue();
                Canvas a3 = AbstractC0585d.a(c0652b.f7552i.e());
                C0885D c0885d = this.f8667h;
                boolean f6 = C0885D.f(c0885d.f8674f);
                h0 h0Var = (h0) this.f8668i;
                boolean F = f6 ? F(270.0f, K1.f.e(-b0.f.b(c1238g.f10415h.e()), c1238g.P(h0Var.f8787b.b(c1238g.getLayoutDirection()))), c0885d.c(), a3) : false;
                if (C0885D.f(c0885d.f8672d)) {
                    F = F(0.0f, K1.f.e(0.0f, c1238g.P(h0Var.f8787b.d())), c0885d.e(), a3) || F;
                }
                if (C0885D.f(c0885d.f8675g)) {
                    F = F(90.0f, K1.f.e(0.0f, c1238g.P(h0Var.f8787b.a(c1238g.getLayoutDirection())) + (-((float) B2.a.D(b0.f.d(c1238g.f10415h.e()))))), c0885d.d(), a3) || F;
                }
                if (C0885D.f(c0885d.f8673e)) {
                    EdgeEffect b3 = c0885d.b();
                    float P2 = c1238g.P(h0Var.f8787b.c());
                    C0652b c0652b2 = c1238g.f10415h;
                    if (!F(180.0f, K1.f.e(-b0.f.d(c0652b2.e()), (-b0.f.b(c0652b2.e())) + P2), b3, a3) && !F) {
                        return;
                    }
                } else if (!F) {
                    return;
                }
                c0905m.g();
                return;
            default:
                long e4 = c1238g.f10415h.e();
                C0905m c0905m2 = this.f8666g;
                c0905m2.l(e4);
                C0652b c0652b3 = c1238g.f10415h;
                if (b0.f.e(c0652b3.e())) {
                    c1238g.a();
                    return;
                }
                c0905m2.f8805j.getValue();
                float P3 = c1238g.P(AbstractC0916y.f8896a);
                Canvas a4 = AbstractC0585d.a(c0652b3.f7552i.e());
                C0885D c0885d2 = this.f8667h;
                boolean z4 = C0885D.f(c0885d2.f8672d) || C0885D.g(c0885d2.f8676h) || C0885D.f(c0885d2.f8673e) || C0885D.g(c0885d2.f8677i);
                boolean z5 = C0885D.f(c0885d2.f8674f) || C0885D.g(c0885d2.f8678j) || C0885D.f(c0885d2.f8675g) || C0885D.g(c0885d2.f8679k);
                if (z4 && z5) {
                    G().setPosition(0, 0, a4.getWidth(), a4.getHeight());
                } else if (z4) {
                    G().setPosition(0, 0, (B2.a.D(P3) * 2) + a4.getWidth(), a4.getHeight());
                } else {
                    if (!z5) {
                        c1238g.a();
                        return;
                    }
                    G().setPosition(0, 0, a4.getWidth(), (B2.a.D(P3) * 2) + a4.getHeight());
                }
                beginRecording = G().beginRecording();
                if (C0885D.g(c0885d2.f8678j)) {
                    EdgeEffect edgeEffect = c0885d2.f8678j;
                    if (edgeEffect == null) {
                        edgeEffect = c0885d2.a();
                        c0885d2.f8678j = edgeEffect;
                    }
                    E(90.0f, edgeEffect, beginRecording);
                    edgeEffect.finish();
                }
                boolean f7 = C0885D.f(c0885d2.f8674f);
                C0906n c0906n = C0906n.f8812a;
                if (f7) {
                    EdgeEffect c3 = c0885d2.c();
                    z3 = E(270.0f, c3, beginRecording);
                    if (C0885D.g(c0885d2.f8674f)) {
                        float e5 = b0.c.e(c0905m2.d());
                        EdgeEffect edgeEffect2 = c0885d2.f8678j;
                        if (edgeEffect2 == null) {
                            edgeEffect2 = c0885d2.a();
                            c0885d2.f8678j = edgeEffect2;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            f5 = c0906n.b(c3);
                            f3 = P3;
                        } else {
                            f3 = P3;
                            f5 = 0.0f;
                        }
                        float f8 = 1 - e5;
                        if (i2 >= 31) {
                            c0906n.c(edgeEffect2, f5, f8);
                        } else {
                            edgeEffect2.onPull(f5, f8);
                        }
                    } else {
                        f3 = P3;
                    }
                } else {
                    f3 = P3;
                    z3 = false;
                }
                if (C0885D.g(c0885d2.f8676h)) {
                    EdgeEffect edgeEffect3 = c0885d2.f8676h;
                    if (edgeEffect3 == null) {
                        edgeEffect3 = c0885d2.a();
                        c0885d2.f8676h = edgeEffect3;
                    }
                    E(180.0f, edgeEffect3, beginRecording);
                    edgeEffect3.finish();
                }
                if (C0885D.f(c0885d2.f8672d)) {
                    EdgeEffect e6 = c0885d2.e();
                    boolean z6 = E(0.0f, e6, beginRecording) || z3;
                    if (C0885D.g(c0885d2.f8672d)) {
                        float d3 = b0.c.d(c0905m2.d());
                        EdgeEffect edgeEffect4 = c0885d2.f8676h;
                        if (edgeEffect4 == null) {
                            edgeEffect4 = c0885d2.a();
                            c0885d2.f8676h = edgeEffect4;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float b4 = i3 >= 31 ? c0906n.b(e6) : 0.0f;
                        if (i3 >= 31) {
                            c0906n.c(edgeEffect4, b4, d3);
                        } else {
                            edgeEffect4.onPull(b4, d3);
                        }
                    }
                    z3 = z6;
                }
                if (C0885D.g(c0885d2.f8679k)) {
                    EdgeEffect edgeEffect5 = c0885d2.f8679k;
                    if (edgeEffect5 == null) {
                        edgeEffect5 = c0885d2.a();
                        c0885d2.f8679k = edgeEffect5;
                    }
                    E(270.0f, edgeEffect5, beginRecording);
                    edgeEffect5.finish();
                }
                if (C0885D.f(c0885d2.f8675g)) {
                    EdgeEffect d4 = c0885d2.d();
                    boolean z7 = E(90.0f, d4, beginRecording) || z3;
                    if (C0885D.g(c0885d2.f8675g)) {
                        float e7 = b0.c.e(c0905m2.d());
                        EdgeEffect edgeEffect6 = c0885d2.f8679k;
                        if (edgeEffect6 == null) {
                            edgeEffect6 = c0885d2.a();
                            c0885d2.f8679k = edgeEffect6;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float b5 = i4 >= 31 ? c0906n.b(d4) : 0.0f;
                        if (i4 >= 31) {
                            c0906n.c(edgeEffect6, b5, e7);
                        } else {
                            edgeEffect6.onPull(b5, e7);
                        }
                    }
                    z3 = z7;
                }
                if (C0885D.g(c0885d2.f8677i)) {
                    EdgeEffect edgeEffect7 = c0885d2.f8677i;
                    if (edgeEffect7 == null) {
                        edgeEffect7 = c0885d2.a();
                        c0885d2.f8677i = edgeEffect7;
                    }
                    f4 = 0.0f;
                    E(0.0f, edgeEffect7, beginRecording);
                    edgeEffect7.finish();
                } else {
                    f4 = 0.0f;
                }
                if (C0885D.f(c0885d2.f8673e)) {
                    EdgeEffect b6 = c0885d2.b();
                    boolean z8 = E(180.0f, b6, beginRecording) || z3;
                    if (C0885D.g(c0885d2.f8673e)) {
                        float d5 = b0.c.d(c0905m2.d());
                        EdgeEffect edgeEffect8 = c0885d2.f8677i;
                        if (edgeEffect8 == null) {
                            edgeEffect8 = c0885d2.a();
                            c0885d2.f8677i = edgeEffect8;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        float b7 = i5 >= 31 ? c0906n.b(b6) : f4;
                        float f9 = 1 - d5;
                        if (i5 >= 31) {
                            c0906n.c(edgeEffect8, b7, f9);
                        } else {
                            edgeEffect8.onPull(b7, f9);
                        }
                    }
                    z3 = z8;
                }
                if (z3) {
                    c0905m2.g();
                }
                float f10 = z5 ? f4 : f3;
                if (!z4) {
                    f4 = f3;
                }
                O0.k layoutDirection = c1238g.getLayoutDirection();
                C0584c c0584c = new C0584c();
                c0584c.f7245a = beginRecording;
                long e8 = c0652b3.e();
                O0.b f11 = c1238g.f10415h.f7552i.f();
                C0652b c0652b4 = c1238g.f10415h;
                O0.k h2 = c0652b4.f7552i.h();
                InterfaceC0600s e9 = c0652b4.f7552i.e();
                long j3 = c0652b4.f7552i.j();
                K1.m mVar = c0652b4.f7552i;
                C0663b c0663b = (C0663b) mVar.f4559b;
                mVar.o(c1238g);
                mVar.q(layoutDirection);
                mVar.n(c0584c);
                mVar.r(e8);
                mVar.f4559b = null;
                c0584c.f();
                try {
                    ((B.F) c1238g.f10415h.f7552i.f4558a).H(f10, f4);
                    try {
                        c1238g.a();
                        float f12 = -f10;
                        float f13 = -f4;
                        ((B.F) c1238g.f10415h.f7552i.f4558a).H(f12, f13);
                        c0584c.b();
                        K1.m mVar2 = c0652b4.f7552i;
                        mVar2.o(f11);
                        mVar2.q(h2);
                        mVar2.n(e9);
                        mVar2.r(j3);
                        mVar2.f4559b = c0663b;
                        G().endRecording();
                        int save = a4.save();
                        a4.translate(f12, f13);
                        a4.drawRenderNode(G());
                        a4.restoreToCount(save);
                        return;
                    } catch (Throwable th) {
                        ((B.F) c1238g.f10415h.f7552i.f4558a).H(-f10, -f4);
                        throw th;
                    }
                } catch (Throwable th2) {
                    c0584c.b();
                    K1.m mVar3 = c0652b4.f7552i;
                    mVar3.o(f11);
                    mVar3.q(h2);
                    mVar3.n(e9);
                    mVar3.r(j3);
                    mVar3.f4559b = c0663b;
                    throw th2;
                }
        }
    }

    public C0884C(C0905m c0905m, C0885D c0885d, h0 h0Var) {
        this.f8666g = c0905m;
        this.f8667h = c0885d;
        this.f8668i = h0Var;
    }
}
