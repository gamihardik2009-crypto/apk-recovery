package v;

/* renamed from: v.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1337I {

    /* renamed from: a, reason: collision with root package name */
    public final y2.c f11288a;

    /* renamed from: b, reason: collision with root package name */
    public final U f11289b = new U();

    /* renamed from: c, reason: collision with root package name */
    public Q1.r f11290c;

    public C1337I(y2.c cVar) {
        this.f11288a = cVar;
    }

    public final InterfaceC1336H a(long j3, int i2) {
        Q1.r rVar = this.f11290c;
        if (rVar == null) {
            return C1353g.f11344a;
        }
        T t3 = new T(rVar, i2, j3, this.f11289b);
        RunnableC1348b runnableC1348b = (RunnableC1348b) rVar.f5324d;
        runnableC1348b.f11332i.b(t3);
        if (runnableC1348b.f11333j) {
            return t3;
        }
        runnableC1348b.f11333j = true;
        runnableC1348b.f11331h.post(runnableC1348b);
        return t3;
    }
}
