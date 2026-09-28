package m;

/* renamed from: m.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0849w implements InterfaceC0836i {

    /* renamed from: a, reason: collision with root package name */
    public final C0 f8588a;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f8589b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8590c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0845s f8591d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0845s f8592e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0845s f8593f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f8594g;

    /* renamed from: h, reason: collision with root package name */
    public final long f8595h;

    public C0849w(C0850x c0850x, x0 x0Var, Object obj, AbstractC0845s abstractC0845s) {
        C0 c02 = new C0(c0850x.f8599a);
        this.f8588a = c02;
        this.f8589b = x0Var;
        this.f8590c = obj;
        AbstractC0845s abstractC0845s2 = (AbstractC0845s) x0Var.f8600a.l(obj);
        this.f8591d = abstractC0845s2;
        this.f8592e = AbstractC0831e.i(abstractC0845s);
        this.f8594g = x0Var.f8601b.l(c02.a(abstractC0845s2, abstractC0845s));
        if (c02.f8288c == null) {
            c02.f8288c = abstractC0845s2.c();
        }
        AbstractC0845s abstractC0845s3 = c02.f8288c;
        if (abstractC0845s3 == null) {
            z2.h.j("velocityVector");
            throw null;
        }
        int b3 = abstractC0845s3.b();
        long j3 = 0;
        for (int i2 = 0; i2 < b3; i2++) {
            abstractC0845s2.getClass();
            j3 = Math.max(j3, c02.f8286a.p(abstractC0845s.a(i2)));
        }
        this.f8595h = j3;
        AbstractC0845s i3 = AbstractC0831e.i(this.f8588a.b(j3, this.f8591d, abstractC0845s));
        this.f8593f = i3;
        int b4 = i3.b();
        for (int i4 = 0; i4 < b4; i4++) {
            AbstractC0845s abstractC0845s4 = this.f8593f;
            float a3 = abstractC0845s4.a(i4);
            float f3 = this.f8588a.f8290e;
            abstractC0845s4.e(B1.C.B(a3, -f3, f3), i4);
        }
    }

    @Override // m.InterfaceC0836i
    public final boolean a() {
        return false;
    }

    @Override // m.InterfaceC0836i
    public final Object b(long j3) {
        if (f(j3)) {
            return this.f8594g;
        }
        y2.c cVar = this.f8589b.f8601b;
        C0 c02 = this.f8588a;
        AbstractC0845s abstractC0845s = c02.f8287b;
        AbstractC0845s abstractC0845s2 = this.f8591d;
        if (abstractC0845s == null) {
            c02.f8287b = abstractC0845s2.c();
        }
        AbstractC0845s abstractC0845s3 = c02.f8287b;
        if (abstractC0845s3 == null) {
            z2.h.j("valueVector");
            throw null;
        }
        int b3 = abstractC0845s3.b();
        for (int i2 = 0; i2 < b3; i2++) {
            AbstractC0845s abstractC0845s4 = c02.f8287b;
            if (abstractC0845s4 == null) {
                z2.h.j("valueVector");
                throw null;
            }
            abstractC0845s4.e(c02.f8286a.n(abstractC0845s2.a(i2), this.f8592e.a(i2), j3), i2);
        }
        AbstractC0845s abstractC0845s5 = c02.f8287b;
        if (abstractC0845s5 != null) {
            return cVar.l(abstractC0845s5);
        }
        z2.h.j("valueVector");
        throw null;
    }

    @Override // m.InterfaceC0836i
    public final long c() {
        return this.f8595h;
    }

    @Override // m.InterfaceC0836i
    public final x0 d() {
        return this.f8589b;
    }

    @Override // m.InterfaceC0836i
    public final Object e() {
        return this.f8594g;
    }

    @Override // m.InterfaceC0836i
    public final AbstractC0845s g(long j3) {
        if (f(j3)) {
            return this.f8593f;
        }
        return this.f8588a.b(j3, this.f8591d, this.f8592e);
    }
}
