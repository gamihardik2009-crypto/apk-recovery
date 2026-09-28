package n1;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class p extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9065i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Bundle f9066j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Bundle bundle, int i2) {
        super(1);
        this.f9065i = i2;
        this.f9066j = bundle;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f9065i) {
            case 0:
                z2.h.f((String) obj, "argName");
                return Boolean.valueOf(!this.f9066j.containsKey(r2));
            default:
                z2.h.f((String) obj, "key");
                return Boolean.valueOf(!this.f9066j.containsKey(r2));
        }
    }
}
