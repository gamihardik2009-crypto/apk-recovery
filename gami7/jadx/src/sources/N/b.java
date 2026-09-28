package N;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4948i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Collection f4949j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, Collection collection) {
        super(1);
        this.f4948i = i2;
        this.f4949j = collection;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f4948i) {
            case 0:
                return Boolean.valueOf(this.f4949j.contains(obj));
            case 1:
                return Boolean.valueOf(this.f4949j.contains(obj));
            default:
                return Boolean.valueOf(((List) obj).retainAll(this.f4949j));
        }
    }
}
