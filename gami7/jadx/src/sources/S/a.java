package S;

import m2.C0880v;

/* loaded from: classes.dex */
public final class a extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b f5535i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f5536j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j f5537k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f5538l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f5539m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object[] f5540n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, m mVar, j jVar, String str, Object obj, Object[] objArr) {
        super(0);
        this.f5535i = bVar;
        this.f5536j = mVar;
        this.f5537k = jVar;
        this.f5538l = str;
        this.f5539m = obj;
        this.f5540n = objArr;
    }

    @Override // y2.a
    public final Object c() {
        boolean z3;
        b bVar = this.f5535i;
        j jVar = bVar.f5542i;
        j jVar2 = this.f5537k;
        boolean z4 = true;
        if (jVar != jVar2) {
            bVar.f5542i = jVar2;
            z3 = true;
        } else {
            z3 = false;
        }
        String str = bVar.f5543j;
        String str2 = this.f5538l;
        if (z2.h.a(str, str2)) {
            z4 = z3;
        } else {
            bVar.f5543j = str2;
        }
        bVar.f5541h = this.f5536j;
        bVar.f5544k = this.f5539m;
        bVar.f5545l = this.f5540n;
        K1.m mVar = bVar.f5546m;
        if (mVar != null && z4) {
            mVar.s();
            bVar.f5546m = null;
            bVar.d();
        }
        return C0880v.f8657a;
    }
}
