package m;

/* loaded from: classes.dex */
public final class C0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0819C f8286a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0845s f8287b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC0845s f8288c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0845s f8289d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8290e;

    public C0(InterfaceC0819C interfaceC0819C) {
        this.f8286a = interfaceC0819C;
        this.f8290e = interfaceC0819C.q();
    }

    public final AbstractC0845s a(AbstractC0845s abstractC0845s, AbstractC0845s abstractC0845s2) {
        if (this.f8289d == null) {
            this.f8289d = abstractC0845s.c();
        }
        AbstractC0845s abstractC0845s3 = this.f8289d;
        if (abstractC0845s3 == null) {
            z2.h.j("targetVector");
            throw null;
        }
        int b3 = abstractC0845s3.b();
        for (int i2 = 0; i2 < b3; i2++) {
            AbstractC0845s abstractC0845s4 = this.f8289d;
            if (abstractC0845s4 == null) {
                z2.h.j("targetVector");
                throw null;
            }
            abstractC0845s4.e(this.f8286a.d(abstractC0845s.a(i2), abstractC0845s2.a(i2)), i2);
        }
        AbstractC0845s abstractC0845s5 = this.f8289d;
        if (abstractC0845s5 != null) {
            return abstractC0845s5;
        }
        z2.h.j("targetVector");
        throw null;
    }

    public final AbstractC0845s b(long j3, AbstractC0845s abstractC0845s, AbstractC0845s abstractC0845s2) {
        if (this.f8288c == null) {
            this.f8288c = abstractC0845s.c();
        }
        AbstractC0845s abstractC0845s3 = this.f8288c;
        if (abstractC0845s3 == null) {
            z2.h.j("velocityVector");
            throw null;
        }
        int b3 = abstractC0845s3.b();
        for (int i2 = 0; i2 < b3; i2++) {
            AbstractC0845s abstractC0845s4 = this.f8288c;
            if (abstractC0845s4 == null) {
                z2.h.j("velocityVector");
                throw null;
            }
            abstractC0845s.getClass();
            abstractC0845s4.e(this.f8286a.m(abstractC0845s2.a(i2), j3), i2);
        }
        AbstractC0845s abstractC0845s5 = this.f8288c;
        if (abstractC0845s5 != null) {
            return abstractC0845s5;
        }
        z2.h.j("velocityVector");
        throw null;
    }
}
