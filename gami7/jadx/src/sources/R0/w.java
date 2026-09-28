package R0;

import m2.C0880v;

/* loaded from: classes.dex */
public final class w extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z2.r f5445i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x f5446j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ O0.i f5447k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f5448l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f5449m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z2.r rVar, x xVar, O0.i iVar, long j3, long j4) {
        super(0);
        this.f5445i = rVar;
        this.f5446j = xVar;
        this.f5447k = iVar;
        this.f5448l = j3;
        this.f5449m = j4;
    }

    @Override // y2.a
    public final Object c() {
        x xVar = this.f5446j;
        A positionProvider = xVar.getPositionProvider();
        O0.k parentLayoutDirection = xVar.getParentLayoutDirection();
        this.f5445i.f11908h = positionProvider.a(this.f5447k, this.f5448l, parentLayoutDirection, this.f5449m);
        return C0880v.f8657a;
    }
}
