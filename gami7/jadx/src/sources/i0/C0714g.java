package i0;

import a.AbstractC0423a;
import android.graphics.Path;
import c0.AbstractC0571K;
import c0.AbstractC0598q;
import c0.C0591j;
import c0.C0592k;
import e0.InterfaceC0654d;
import java.util.List;
import m2.EnumC0863e;
import m2.InterfaceC0862d;
import n2.C0970v;

/* renamed from: i0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0714g extends AbstractC0728u {

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0598q f7884b;

    /* renamed from: c, reason: collision with root package name */
    public float f7885c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public List f7886d;

    /* renamed from: e, reason: collision with root package name */
    public float f7887e;

    /* renamed from: f, reason: collision with root package name */
    public float f7888f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractC0598q f7889g;

    /* renamed from: h, reason: collision with root package name */
    public int f7890h;

    /* renamed from: i, reason: collision with root package name */
    public int f7891i;

    /* renamed from: j, reason: collision with root package name */
    public float f7892j;

    /* renamed from: k, reason: collision with root package name */
    public float f7893k;

    /* renamed from: l, reason: collision with root package name */
    public float f7894l;

    /* renamed from: m, reason: collision with root package name */
    public float f7895m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7896n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7897o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7898p;
    public e0.h q;

    /* renamed from: r, reason: collision with root package name */
    public final C0591j f7899r;

    /* renamed from: s, reason: collision with root package name */
    public C0591j f7900s;

    /* renamed from: t, reason: collision with root package name */
    public final InterfaceC0862d f7901t;

    public C0714g() {
        int i2 = AbstractC0732y.f7958a;
        this.f7886d = C0970v.f9165h;
        this.f7887e = 1.0f;
        this.f7890h = 0;
        this.f7891i = 0;
        this.f7892j = 4.0f;
        this.f7894l = 1.0f;
        this.f7896n = true;
        this.f7897o = true;
        C0591j h2 = AbstractC0571K.h();
        this.f7899r = h2;
        this.f7900s = h2;
        this.f7901t = B2.a.x(EnumC0863e.f8644i, C0713f.f7881j);
    }

    @Override // i0.AbstractC0728u
    public final void a(InterfaceC0654d interfaceC0654d) {
        if (this.f7896n) {
            AbstractC0423a.c0(this.f7886d, this.f7899r);
            e();
        } else if (this.f7898p) {
            e();
        }
        this.f7896n = false;
        this.f7898p = false;
        AbstractC0598q abstractC0598q = this.f7884b;
        if (abstractC0598q != null) {
            InterfaceC0654d.U(interfaceC0654d, this.f7900s, abstractC0598q, this.f7885c, null, 56);
        }
        AbstractC0598q abstractC0598q2 = this.f7889g;
        if (abstractC0598q2 != null) {
            e0.h hVar = this.q;
            if (this.f7897o || hVar == null) {
                hVar = new e0.h(this.f7888f, this.f7892j, this.f7890h, this.f7891i, 16);
                this.q = hVar;
                this.f7897o = false;
            }
            InterfaceC0654d.U(interfaceC0654d, this.f7900s, abstractC0598q2, this.f7887e, hVar, 48);
        }
    }

    public final void e() {
        Path path;
        float f3 = this.f7893k;
        C0591j c0591j = this.f7899r;
        if (f3 == 0.0f && this.f7894l == 1.0f) {
            this.f7900s = c0591j;
            return;
        }
        if (z2.h.a(this.f7900s, c0591j)) {
            this.f7900s = AbstractC0571K.h();
        } else {
            int i2 = this.f7900s.f7260a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.f7900s.f7260a.rewind();
            this.f7900s.f(i2);
        }
        InterfaceC0862d interfaceC0862d = this.f7901t;
        C0592k c0592k = (C0592k) interfaceC0862d.getValue();
        if (c0591j != null) {
            c0592k.getClass();
            path = c0591j.f7260a;
        } else {
            path = null;
        }
        c0592k.f7263a.setPath(path, false);
        float length = ((C0592k) interfaceC0862d.getValue()).f7263a.getLength();
        float f4 = this.f7893k;
        float f5 = this.f7895m;
        float f6 = ((f4 + f5) % 1.0f) * length;
        float f7 = ((this.f7894l + f5) % 1.0f) * length;
        if (f6 <= f7) {
            ((C0592k) interfaceC0862d.getValue()).a(f6, f7, this.f7900s);
        } else {
            ((C0592k) interfaceC0862d.getValue()).a(f6, length, this.f7900s);
            ((C0592k) interfaceC0862d.getValue()).a(0.0f, f7, this.f7900s);
        }
    }

    public final String toString() {
        return this.f7899r.toString();
    }
}
