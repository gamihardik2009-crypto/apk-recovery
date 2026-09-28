package b;

import m2.C0880v;

/* renamed from: b.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0493q extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7026i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0499w f7027j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0493q(C0499w c0499w, int i2) {
        super(0);
        this.f7026i = i2;
        this.f7027j = c0499w;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f7026i) {
            case 0:
                this.f7027j.c();
                break;
            case 1:
                this.f7027j.b();
                break;
            default:
                this.f7027j.c();
                break;
        }
        return C0880v.f8657a;
    }
}
