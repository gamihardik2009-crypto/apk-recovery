package J;

/* loaded from: classes.dex */
public final class G implements A0 {

    /* renamed from: h, reason: collision with root package name */
    public final y2.c f4013h;

    /* renamed from: i, reason: collision with root package name */
    public H f4014i;

    public G(y2.c cVar) {
        this.f4013h = cVar;
    }

    @Override // J.A0
    public final void a() {
        H h2 = this.f4014i;
        if (h2 != null) {
            h2.a();
        }
        this.f4014i = null;
    }

    @Override // J.A0
    public final void b() {
        this.f4014i = (H) this.f4013h.l(C0257c.f4126h);
    }

    @Override // J.A0
    public final void c() {
    }
}
