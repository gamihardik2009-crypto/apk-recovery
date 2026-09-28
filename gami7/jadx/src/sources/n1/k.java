package n1;

/* loaded from: classes.dex */
public final class k extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9057i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y f9058j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(y yVar, int i2) {
        super(1);
        this.f9057i = i2;
        this.f9058j = yVar;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f9057i) {
            case 0:
                z2.h.f((s) obj, "destination");
                return Boolean.valueOf(!this.f9058j.f9128m.containsKey(Integer.valueOf(r2.f9093n)));
            default:
                z2.h.f((s) obj, "destination");
                return Boolean.valueOf(!this.f9058j.f9128m.containsKey(Integer.valueOf(r2.f9093n)));
        }
    }
}
