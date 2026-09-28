package l;

import m.p0;

/* renamed from: l.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0807p extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8231i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p0 f8232j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0807p(p0 p0Var, int i2) {
        super(0);
        this.f8231i = i2;
        this.f8232j = p0Var;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f8231i) {
            case 0:
                p0 p0Var = this.f8232j;
                Object g3 = p0Var.f8547a.g();
                EnumC0812v enumC0812v = EnumC0812v.f8248j;
                return Boolean.valueOf(g3 == enumC0812v && p0Var.f8550d.getValue() == enumC0812v);
            default:
                return Long.valueOf(this.f8232j.b());
        }
    }
}
