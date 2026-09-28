package i0;

import java.util.Iterator;
import java.util.List;

/* renamed from: i0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0731x extends AbstractC0733z implements Iterable, A2.a {

    /* renamed from: h, reason: collision with root package name */
    public final String f7949h;

    /* renamed from: i, reason: collision with root package name */
    public final float f7950i;

    /* renamed from: j, reason: collision with root package name */
    public final float f7951j;

    /* renamed from: k, reason: collision with root package name */
    public final float f7952k;

    /* renamed from: l, reason: collision with root package name */
    public final float f7953l;

    /* renamed from: m, reason: collision with root package name */
    public final float f7954m;

    /* renamed from: n, reason: collision with root package name */
    public final float f7955n;

    /* renamed from: o, reason: collision with root package name */
    public final float f7956o;

    /* renamed from: p, reason: collision with root package name */
    public final List f7957p;
    public final List q;

    public C0731x(String str, float f3, float f4, float f5, float f6, float f7, float f8, float f9, List list, List list2) {
        this.f7949h = str;
        this.f7950i = f3;
        this.f7951j = f4;
        this.f7952k = f5;
        this.f7953l = f6;
        this.f7954m = f7;
        this.f7955n = f8;
        this.f7956o = f9;
        this.f7957p = list;
        this.q = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C0731x)) {
            C0731x c0731x = (C0731x) obj;
            return z2.h.a(this.f7949h, c0731x.f7949h) && this.f7950i == c0731x.f7950i && this.f7951j == c0731x.f7951j && this.f7952k == c0731x.f7952k && this.f7953l == c0731x.f7953l && this.f7954m == c0731x.f7954m && this.f7955n == c0731x.f7955n && this.f7956o == c0731x.f7956o && z2.h.a(this.f7957p, c0731x.f7957p) && z2.h.a(this.q, c0731x.q);
        }
        return false;
    }

    public final int hashCode() {
        return this.q.hashCode() + ((this.f7957p.hashCode() + B1.t.c(this.f7956o, B1.t.c(this.f7955n, B1.t.c(this.f7954m, B1.t.c(this.f7953l, B1.t.c(this.f7952k, B1.t.c(this.f7951j, B1.t.c(this.f7950i, this.f7949h.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new O.h(this);
    }
}
