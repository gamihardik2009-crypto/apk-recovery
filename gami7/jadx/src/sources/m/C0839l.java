package m;

import J.C0257c;
import J.C0274k0;

/* renamed from: m.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0839l {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f8508a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8509b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8510c;

    /* renamed from: d, reason: collision with root package name */
    public final y2.a f8511d;

    /* renamed from: e, reason: collision with root package name */
    public final C0274k0 f8512e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC0845s f8513f;

    /* renamed from: g, reason: collision with root package name */
    public long f8514g;

    /* renamed from: h, reason: collision with root package name */
    public long f8515h;

    /* renamed from: i, reason: collision with root package name */
    public final C0274k0 f8516i;

    public C0839l(Object obj, x0 x0Var, AbstractC0845s abstractC0845s, long j3, Object obj2, long j4, y2.a aVar) {
        this.f8508a = x0Var;
        this.f8509b = obj2;
        this.f8510c = j4;
        this.f8511d = aVar;
        J.W w2 = J.W.f4109m;
        this.f8512e = C0257c.N(obj, w2);
        this.f8513f = AbstractC0831e.i(abstractC0845s);
        this.f8514g = j3;
        this.f8515h = Long.MIN_VALUE;
        this.f8516i = C0257c.N(Boolean.TRUE, w2);
    }

    public final void a() {
        this.f8516i.setValue(Boolean.FALSE);
        this.f8511d.c();
    }
}
