package K0;

import C1.y;
import H.C0101f1;
import J.C0257c;
import J.F;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import c0.AbstractC0571K;
import c0.AbstractC0574N;
import c0.AbstractC0598q;
import c0.C0575O;
import c0.C0578S;
import c0.C0589h;
import e0.AbstractC0655e;

/* loaded from: classes.dex */
public final class e extends TextPaint {

    /* renamed from: a, reason: collision with root package name */
    public C0589h f4514a;

    /* renamed from: b, reason: collision with root package name */
    public N0.j f4515b;

    /* renamed from: c, reason: collision with root package name */
    public int f4516c;

    /* renamed from: d, reason: collision with root package name */
    public C0575O f4517d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC0598q f4518e;

    /* renamed from: f, reason: collision with root package name */
    public F f4519f;

    /* renamed from: g, reason: collision with root package name */
    public b0.f f4520g;

    /* renamed from: h, reason: collision with root package name */
    public AbstractC0655e f4521h;

    public final C0589h a() {
        C0589h c0589h = this.f4514a;
        if (c0589h != null) {
            return c0589h;
        }
        C0589h c0589h2 = new C0589h(this);
        this.f4514a = c0589h2;
        return c0589h2;
    }

    public final void b(int i2) {
        if (AbstractC0571K.m(i2, this.f4516c)) {
            return;
        }
        a().d(i2);
        this.f4516c = i2;
    }

    public final void c(AbstractC0598q abstractC0598q, long j3, float f3) {
        b0.f fVar;
        if (abstractC0598q == null) {
            this.f4519f = null;
            this.f4518e = null;
            this.f4520g = null;
            setShader(null);
            return;
        }
        if (abstractC0598q instanceof C0578S) {
            d(y.H(f3, ((C0578S) abstractC0598q).f7238a));
            return;
        }
        if (abstractC0598q instanceof AbstractC0574N) {
            if ((!z2.h.a(this.f4518e, abstractC0598q) || (fVar = this.f4520g) == null || !b0.f.a(fVar.f7072a, j3)) && j3 != 9205357640488583168L) {
                this.f4518e = abstractC0598q;
                this.f4520g = new b0.f(j3);
                this.f4519f = C0257c.F(new C0101f1(1, j3, abstractC0598q));
            }
            C0589h a3 = a();
            F f4 = this.f4519f;
            a3.h(f4 != null ? (Shader) f4.getValue() : null);
            j.c(this, f3);
        }
    }

    public final void d(long j3) {
        if (j3 != 16) {
            setColor(AbstractC0571K.A(j3));
            this.f4519f = null;
            this.f4518e = null;
            this.f4520g = null;
            setShader(null);
        }
    }

    public final void e(AbstractC0655e abstractC0655e) {
        if (abstractC0655e == null || z2.h.a(this.f4521h, abstractC0655e)) {
            return;
        }
        this.f4521h = abstractC0655e;
        if (z2.h.a(abstractC0655e, e0.g.f7556a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (abstractC0655e instanceof e0.h) {
            a().l(1);
            e0.h hVar = (e0.h) abstractC0655e;
            a().k(hVar.f7557a);
            a().f7254a.setStrokeMiter(hVar.f7558b);
            a().j(hVar.f7560d);
            a().i(hVar.f7559c);
            a().f7254a.setPathEffect(null);
        }
    }

    public final void f(C0575O c0575o) {
        if (c0575o == null || z2.h.a(this.f4517d, c0575o)) {
            return;
        }
        this.f4517d = c0575o;
        if (z2.h.a(c0575o, C0575O.f7219d)) {
            clearShadowLayer();
            return;
        }
        C0575O c0575o2 = this.f4517d;
        float f3 = c0575o2.f7222c;
        if (f3 == 0.0f) {
            f3 = Float.MIN_VALUE;
        }
        setShadowLayer(f3, b0.c.d(c0575o2.f7221b), b0.c.e(this.f4517d.f7221b), AbstractC0571K.A(this.f4517d.f7220a));
    }

    public final void g(N0.j jVar) {
        if (jVar == null || z2.h.a(this.f4515b, jVar)) {
            return;
        }
        this.f4515b = jVar;
        int i2 = jVar.f4996a;
        setUnderlineText((i2 | 1) == i2);
        N0.j jVar2 = this.f4515b;
        jVar2.getClass();
        int i3 = jVar2.f4996a;
        setStrikeThruText((i3 | 2) == i3);
    }
}
