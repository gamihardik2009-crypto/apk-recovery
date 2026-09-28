package z;

import C0.C0024g;
import java.util.List;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final C0024g f11605a;

    /* renamed from: b, reason: collision with root package name */
    public final C0.K f11606b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11607c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11608d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11609e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11610f;

    /* renamed from: g, reason: collision with root package name */
    public final O0.b f11611g;

    /* renamed from: h, reason: collision with root package name */
    public final H0.d f11612h;

    /* renamed from: i, reason: collision with root package name */
    public final List f11613i;

    /* renamed from: j, reason: collision with root package name */
    public Q1.e f11614j;

    /* renamed from: k, reason: collision with root package name */
    public O0.k f11615k;

    public Z(C0024g c0024g, C0.K k3, int i2, int i3, boolean z3, int i4, O0.b bVar, H0.d dVar, List list) {
        this.f11605a = c0024g;
        this.f11606b = k3;
        this.f11607c = i2;
        this.f11608d = i3;
        this.f11609e = z3;
        this.f11610f = i4;
        this.f11611g = bVar;
        this.f11612h = dVar;
        this.f11613i = list;
        if (i2 <= 0) {
            throw new IllegalArgumentException("no maxLines".toString());
        }
        if (i3 <= 0) {
            throw new IllegalArgumentException("no minLines".toString());
        }
        if (i3 > i2) {
            throw new IllegalArgumentException("minLines greater than maxLines".toString());
        }
    }

    public final void a(O0.k kVar) {
        Q1.e eVar = this.f11614j;
        if (eVar == null || kVar != this.f11615k || eVar.b()) {
            this.f11615k = kVar;
            eVar = new Q1.e(this.f11605a, B2.a.C(this.f11606b, kVar), this.f11613i, this.f11611g, this.f11612h);
        }
        this.f11614j = eVar;
    }
}
