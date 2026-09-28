package W1;

import java.util.List;

/* loaded from: classes.dex */
public final class w extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6090i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2.c f6091j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f6092k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(y2.c cVar, List list, int i2) {
        super(1);
        this.f6090i = i2;
        this.f6091j = cVar;
        this.f6092k = list;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f6090i) {
            case 0:
                return this.f6091j.l(this.f6092k.get(((Number) obj).intValue()));
            case 1:
                return this.f6091j.l(this.f6092k.get(((Number) obj).intValue()));
            case 2:
                return this.f6091j.l(this.f6092k.get(((Number) obj).intValue()));
            case 3:
                return this.f6091j.l(this.f6092k.get(((Number) obj).intValue()));
            case 4:
                return this.f6091j.l(this.f6092k.get(((Number) obj).intValue()));
            default:
                return this.f6091j.l(this.f6092k.get(((Number) obj).intValue()));
        }
    }
}
