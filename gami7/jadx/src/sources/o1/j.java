package o1;

/* loaded from: classes.dex */
public final class j extends n1.t {

    /* renamed from: g, reason: collision with root package name */
    public final i f9244g;

    /* renamed from: h, reason: collision with root package name */
    public final y2.g f9245h;

    /* renamed from: i, reason: collision with root package name */
    public y2.c f9246i;

    /* renamed from: j, reason: collision with root package name */
    public y2.c f9247j;

    /* renamed from: k, reason: collision with root package name */
    public y2.c f9248k;

    /* renamed from: l, reason: collision with root package name */
    public y2.c f9249l;

    /* renamed from: m, reason: collision with root package name */
    public y2.c f9250m;

    public j(i iVar, String str, R.a aVar) {
        super(iVar, str);
        this.f9244g = iVar;
        this.f9245h = aVar;
    }

    @Override // n1.t
    public final n1.s a() {
        h hVar = (h) super.a();
        hVar.f9238r = this.f9246i;
        hVar.f9239s = this.f9247j;
        hVar.f9240t = this.f9248k;
        hVar.f9241u = this.f9249l;
        hVar.f9242v = this.f9250m;
        return hVar;
    }

    @Override // n1.t
    public final n1.s b() {
        return new h(this.f9244g, this.f9245h);
    }
}
