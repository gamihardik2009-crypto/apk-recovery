package R0;

import m2.C0880v;

/* renamed from: R0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0372b extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5387i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u f5388j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0372b(u uVar, int i2) {
        super(1);
        this.f5387i = i2;
        this.f5388j = uVar;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f5387i) {
            case 0:
                u uVar = this.f5388j;
                uVar.show();
                return new C0371a(0, uVar);
            default:
                u uVar2 = this.f5388j;
                if (uVar2.f5439l.f5429a) {
                    uVar2.f5438k.c();
                }
                return C0880v.f8657a;
        }
    }
}
