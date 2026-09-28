package i0;

import c0.AbstractC0571K;
import c0.AbstractC0598q;
import java.util.ArrayList;
import java.util.List;
import m.AbstractC0837j;

/* renamed from: i0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0707B extends AbstractC0733z {

    /* renamed from: h, reason: collision with root package name */
    public final String f7813h;

    /* renamed from: i, reason: collision with root package name */
    public final List f7814i;

    /* renamed from: j, reason: collision with root package name */
    public final int f7815j;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0598q f7816k;

    /* renamed from: l, reason: collision with root package name */
    public final float f7817l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC0598q f7818m;

    /* renamed from: n, reason: collision with root package name */
    public final float f7819n;

    /* renamed from: o, reason: collision with root package name */
    public final float f7820o;

    /* renamed from: p, reason: collision with root package name */
    public final int f7821p;
    public final int q;

    /* renamed from: r, reason: collision with root package name */
    public final float f7822r;

    /* renamed from: s, reason: collision with root package name */
    public final float f7823s;

    /* renamed from: t, reason: collision with root package name */
    public final float f7824t;

    /* renamed from: u, reason: collision with root package name */
    public final float f7825u;

    public C0707B(String str, ArrayList arrayList, int i2, AbstractC0598q abstractC0598q, float f3, AbstractC0598q abstractC0598q2, float f4, float f5, int i3, int i4, float f6, float f7, float f8, float f9) {
        this.f7813h = str;
        this.f7814i = arrayList;
        this.f7815j = i2;
        this.f7816k = abstractC0598q;
        this.f7817l = f3;
        this.f7818m = abstractC0598q2;
        this.f7819n = f4;
        this.f7820o = f5;
        this.f7821p = i3;
        this.q = i4;
        this.f7822r = f6;
        this.f7823s = f7;
        this.f7824t = f8;
        this.f7825u = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0707B.class == obj.getClass()) {
            C0707B c0707b = (C0707B) obj;
            return z2.h.a(this.f7813h, c0707b.f7813h) && z2.h.a(this.f7816k, c0707b.f7816k) && this.f7817l == c0707b.f7817l && z2.h.a(this.f7818m, c0707b.f7818m) && this.f7819n == c0707b.f7819n && this.f7820o == c0707b.f7820o && AbstractC0571K.o(this.f7821p, c0707b.f7821p) && AbstractC0571K.p(this.q, c0707b.q) && this.f7822r == c0707b.f7822r && this.f7823s == c0707b.f7823s && this.f7824t == c0707b.f7824t && this.f7825u == c0707b.f7825u && this.f7815j == c0707b.f7815j && z2.h.a(this.f7814i, c0707b.f7814i);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f7814i.hashCode() + (this.f7813h.hashCode() * 31)) * 31;
        AbstractC0598q abstractC0598q = this.f7816k;
        int c3 = B1.t.c(this.f7817l, (hashCode + (abstractC0598q != null ? abstractC0598q.hashCode() : 0)) * 31, 31);
        AbstractC0598q abstractC0598q2 = this.f7818m;
        return Integer.hashCode(this.f7815j) + B1.t.c(this.f7825u, B1.t.c(this.f7824t, B1.t.c(this.f7823s, B1.t.c(this.f7822r, AbstractC0837j.b(this.q, AbstractC0837j.b(this.f7821p, B1.t.c(this.f7820o, B1.t.c(this.f7819n, (c3 + (abstractC0598q2 != null ? abstractC0598q2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
