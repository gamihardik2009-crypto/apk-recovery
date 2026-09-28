package T;

import m2.C0880v;

/* renamed from: T.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0373a extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5666i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2.c f5667j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.c f5668k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0373a(y2.c cVar, y2.c cVar2, int i2) {
        super(1);
        this.f5666i = i2;
        this.f5667j = cVar;
        this.f5668k = cVar2;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        int i2;
        switch (this.f5666i) {
            case 0:
                l lVar = (l) obj;
                synchronized (n.f5710b) {
                    i2 = n.f5712d;
                    n.f5712d = i2 + 1;
                }
                return new C0375c(i2, lVar, this.f5667j, this.f5668k);
            case 1:
                this.f5667j.l(obj);
                this.f5668k.l(obj);
                return C0880v.f8657a;
            default:
                this.f5667j.l(obj);
                this.f5668k.l(obj);
                return C0880v.f8657a;
        }
    }
}
