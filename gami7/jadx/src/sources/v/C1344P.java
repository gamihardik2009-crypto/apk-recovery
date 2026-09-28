package v;

import java.util.Map;

/* renamed from: v.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1344P extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11308i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S.j f11309j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1344P(S.j jVar, int i2) {
        super(1);
        this.f11308i = i2;
        this.f11309j = jVar;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f11308i) {
            case 0:
                S.j jVar = this.f11309j;
                return Boolean.valueOf(jVar != null ? jVar.c(obj) : true);
            default:
                return new C1346S(this.f11309j, (Map) obj);
        }
    }
}
