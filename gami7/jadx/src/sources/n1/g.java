package n1;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC0466o;

/* loaded from: classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new A1.a(3);

    /* renamed from: h, reason: collision with root package name */
    public final String f9038h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9039i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f9040j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f9041k;

    public g(C0945f c0945f) {
        z2.h.f(c0945f, "entry");
        this.f9038h = c0945f.f9032m;
        this.f9039i = c0945f.f9028i.f9093n;
        this.f9040j = c0945f.g();
        Bundle bundle = new Bundle();
        this.f9041k = bundle;
        c0945f.f9035p.i(bundle);
    }

    public final C0945f a(Context context, s sVar, EnumC0466o enumC0466o, m mVar) {
        z2.h.f(context, "context");
        z2.h.f(enumC0466o, "hostLifecycleState");
        Bundle bundle = this.f9040j;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        String str = this.f9038h;
        z2.h.f(str, "id");
        return new C0945f(context, sVar, bundle2, enumC0466o, mVar, str, this.f9041k);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        z2.h.f(parcel, "parcel");
        parcel.writeString(this.f9038h);
        parcel.writeInt(this.f9039i);
        parcel.writeBundle(this.f9040j);
        parcel.writeBundle(this.f9041k);
    }

    public g(Parcel parcel) {
        z2.h.f(parcel, "inParcel");
        String readString = parcel.readString();
        z2.h.c(readString);
        this.f9038h = readString;
        this.f9039i = parcel.readInt();
        this.f9040j = parcel.readBundle(g.class.getClassLoader());
        Bundle readBundle = parcel.readBundle(g.class.getClassLoader());
        z2.h.c(readBundle);
        this.f9041k = readBundle;
    }
}
